package es.cuatrovientos.examenev2.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ScrollView;

import es.cuatrovientos.examenev2.R;
import es.cuatrovientos.examenev2.adapters.FilmAdapter;
import es.cuatrovientos.examenev2.fragments.DataFragment;
import es.cuatrovientos.examenev2.fragments.DetailsFragment;
import es.cuatrovientos.examenev2.models.Film;
import es.cuatrovientos.examenev2.utils.Utils;
import io.realm.Case;
import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends FragmentActivity implements  DataFragment.Comunication {
    RecyclerView continueWatching, popular, myList, rvSearch;
    FilmAdapter filmAdapter;

    Realm realm;
    RealmResults<Film> results;
    AutoCompleteTextView search;
    ScrollView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void sendData(int id) {
        if(isInMultiPanel()) {
            DetailsFragment details = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
            details.reciveData(id);
        }else{
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("id", id);
            startActivity(intent);
        }
    }
    private boolean isInMultiPanel() {
        int orientation = getResources().getConfiguration().orientation;
        return orientation == Configuration.ORIENTATION_LANDSCAPE;
    }
}