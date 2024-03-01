package es.cuatrovientos.examenev2.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import es.cuatrovientos.examenev2.R;
import es.cuatrovientos.examenev2.models.Film;
import io.realm.Realm;

public class DetailsActivity extends AppCompatActivity {
    int id;
    Film film;
    Realm realm;
    ImageView banner;
    TextView title, description, creator, cast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        id = getIntent().getExtras().getInt("id");
        realm = Realm.getDefaultInstance();
        film = realm.where(Film.class).equalTo("id", id).findFirst();
        banner = findViewById(R.id.imgBanner);
        title = findViewById(R.id.txtTitle);
        description = findViewById(R.id.txtDescription);
        creator = findViewById(R.id.txtCreator);
        cast = findViewById(R.id.txtCast);

        banner.setBackgroundResource(film.getDetailImageResourceId());
        title.setText(film.getTitle());
        description.setText(film.getDescription());
        creator.setText(film.getCreator());
        cast.setText(film.getCast());
    }
}