package es.cuatrovientos.examenev2.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ScrollView;

import org.jetbrains.annotations.NotNull;

import es.cuatrovientos.examenev2.R;
import es.cuatrovientos.examenev2.activitys.DetailsActivity;
import es.cuatrovientos.examenev2.adapters.FilmAdapter;
import es.cuatrovientos.examenev2.models.Film;
import es.cuatrovientos.examenev2.utils.Utils;
import io.realm.Case;
import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;

public class DataFragment extends Fragment {
    Realm realm;
    RealmResults<Film> results;

    FilmAdapter filmAdapter;
    RecyclerView continueWatching, popular, myList, rvSearch;
    ScrollView content;
    Comunication callback;
    AutoCompleteTextView search;
    ImageView logo;
    public DataFragment() {}
    @Override
    public void onAttach(@NotNull Context context){
        super.onAttach(context);
        try{
            callback = (Comunication) context;
        }catch (Exception e){
            Log.e("ERROR", "Somthing went wrong");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data, container, false);
        continueWatching = view.findViewById(R.id.rvContinueWatching);
        popular = view.findViewById(R.id.rvPopular);
        myList = view.findViewById(R.id.rvMyList);
        search = view.findViewById(R.id.actxtSearch);
        content = view.findViewById(R.id.svContent);
        rvSearch = view.findViewById(R.id.rvSearch);
        logo = view.findViewById(R.id.imgLogoData);
        realm = Realm.getDefaultInstance();

        logo.setBackgroundResource(R.drawable.netflix);

        realm.beginTransaction();
        realm.delete(Film.class);
        realm.copyToRealm(Utils.getDummyData());
        realm.commitTransaction();

        //ContinueWatching
        results = realm.where(Film.class).equalTo("continueWatching", true).findAll();
        filmAdapter = new FilmAdapter(results, new FilmAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Film film, int position) {
                callback.sendData(film.getId());
            }
        });
        continueWatching.setAdapter(filmAdapter);
        continueWatching.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL,false));

        results.addChangeListener(new RealmChangeListener<RealmResults<Film>>() {
            @Override
            public void onChange(RealmResults<Film> mails) {
                filmAdapter.notifyDataSetChanged();
            }
        });

        //Popular
        results = realm.where(Film.class).equalTo("popular", true).findAll();
        filmAdapter = new FilmAdapter(results, new FilmAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Film film, int position) {
                callback.sendData(film.getId());
            }
        });
        popular.setAdapter(filmAdapter);
        popular.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL,false));

        results.addChangeListener(new RealmChangeListener<RealmResults<Film>>() {
            @Override
            public void onChange(RealmResults<Film> mails) {
                filmAdapter.notifyDataSetChanged();
            }
        });

        //MyList
        results = realm.where(Film.class).equalTo("myList", true).findAll();
        filmAdapter = new FilmAdapter(results, new FilmAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Film film, int position) {
                callback.sendData(film.getId());
            }
        });
        myList.setAdapter(filmAdapter);
        myList.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL,false));

        results.addChangeListener(new RealmChangeListener<RealmResults<Film>>() {
            @Override
            public void onChange(RealmResults<Film> mails) {
                filmAdapter.notifyDataSetChanged();
            }
        });

        String[] filmTitles = getFilmTitlesFromRealm();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_dropdown_item_1line, filmTitles);
        search.setAdapter(adapter);

        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = search.getText().toString();
                if (text.isEmpty() || text == null){
                    content.setVisibility(View.VISIBLE);
                    rvSearch.setVisibility(View.INVISIBLE);
                } else {
                    results = realm.where(Film.class).contains("title", text, Case.INSENSITIVE).findAll();
                    filmAdapter = new FilmAdapter(results, new FilmAdapter.OnItemClickListener() {
                        @Override
                        public void onItemClick(Film film, int position) {
                            Intent intent = new Intent(requireContext(), DetailsActivity.class);
                            intent.putExtra("id",film.getId());
                            startActivity(intent);
                        }
                    });
                    rvSearch.setAdapter(filmAdapter);
                    rvSearch.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false));
                    rvSearch.setVisibility(View.VISIBLE);
                    content.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        return view;
    }

    public interface Comunication{
        public void sendData(int id);
    }
    private String[] getFilmTitlesFromRealm() {
        RealmResults<Film> films = realm.where(Film.class).findAll();
        String[] titles = new String[films.size()];

        for (int i = 0; i < films.size(); i++) {
            titles[i] = films.get(i).getTitle();
        }

        return titles;
    }
}