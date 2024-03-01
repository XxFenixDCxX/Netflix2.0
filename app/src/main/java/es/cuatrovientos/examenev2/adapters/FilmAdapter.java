package es.cuatrovientos.examenev2.adapters;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.cuatrovientos.examenev2.R;
import es.cuatrovientos.examenev2.activitys.DetailsActivity;
import es.cuatrovientos.examenev2.activitys.MainActivity;
import es.cuatrovientos.examenev2.models.Film;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.FilmHolder>{
    private List<Film> listData;
    private OnItemClickListener listener;

    public FilmAdapter(List<Film> listData, OnItemClickListener listener){
        this.listData = listData;
        this.listener = listener;
    }
    @NonNull
    @Override
    public FilmAdapter.FilmHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.film_item,parent, false);
        return new FilmHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmHolder holder, int position) {
        holder.assingData(listData.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class FilmHolder extends RecyclerView.ViewHolder {
        ImageView card;
        public FilmHolder(@NonNull View itemView) {
            super(itemView);
            card = itemView.findViewById(R.id.imgCard);
        }
        public void assingData(Film film, OnItemClickListener listener){
            card.setBackgroundResource(film.getImageResourceId());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(film, getAdapterPosition());
                }
            });
        }
    }
    public interface OnItemClickListener{
        void onItemClick(Film film, int position);
    }
}
