package es.cuatrovientos.examenev2.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import es.cuatrovientos.examenev2.R;
import es.cuatrovientos.examenev2.models.Film;
import io.realm.Realm;

public class DetailsFragment extends Fragment {
    ImageView banner, logo;
    TextView title, description, creator, cast;
    Realm realm;

    public DetailsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        banner = view.findViewById(R.id.imgBanner);
        title = view.findViewById(R.id.txtTitle);
        description = view.findViewById(R.id.txtDescription);
        creator = view.findViewById(R.id.txtCreator);
        cast = view.findViewById(R.id.txtCast);
        logo = view.findViewById(R.id.imgLogo);
        realm = Realm.getDefaultInstance();

        logo.setBackgroundResource(R.drawable.netflix);
        return view;
    }
    public void reciveData(int id){
        Film film = realm.where(Film.class).equalTo("id", id).findFirst();
        int detailImageResourceId = film.getDetailImageResourceId();
        String title = film.getTitle();
        String description = film.getDescription();
        String creator = film.getCreator();
        String cast = film.getCast();
        if(this.banner != null){
            this.banner.setBackgroundResource(detailImageResourceId);
        }
        if(this.title != null){
            this.title.setText(title);
        }
        if(this.description != null){
            this.description.setText(description);
        }
        if(this.creator != null){
            this.creator.setText(creator);
        }
        if(this.cast != null){
            this.cast.setText(cast);
        }
    }
}