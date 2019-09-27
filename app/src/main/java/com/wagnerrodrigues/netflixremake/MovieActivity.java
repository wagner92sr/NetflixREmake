package com.wagnerrodrigues.netflixremake;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MovieActivity extends AppCompatActivity {

    private TextView txtTitle;
    private TextView txtDesc;
    private TextView txtCast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        txtTitle = findViewById(R.id.text_view_title);
        txtDesc = findViewById(R.id.text_view_desc);
        txtCast = findViewById(R.id.text_view_cast);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if( getSupportActionBar() != null){
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
            getSupportActionBar().setTitle(null);
        }

        LayerDrawable drawable = (LayerDrawable) ContextCompat.getDrawable(this,R.drawable.shadows);

        if(drawable != null){
            Drawable movieCover = ContextCompat.getDrawable(this, R.drawable.movie);

            drawable.setDrawableByLayerId(R.id.cover_drawable, movieCover);

            ((ImageView) findViewById(R.id.imageView_cover)).setImageDrawable(drawable);
        }

        txtTitle.setText("Batman Begins");
        txtDesc.setText("O jovem Bruce Wayne tralalá blá blá blá cobate o crime na cidade de Gothan");
        txtCast.setText(getString(R.string.cast, "Wagner" + ",Teste" + ",teste" + ",teste"));
    }
}
