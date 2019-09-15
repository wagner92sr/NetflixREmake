package com.wagnerrodrigues.netflixremake;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.widget.ImageView;


public class MovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if( getSupportActionBar() != null){
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
        }

        LayerDrawable drawable = (LayerDrawable) ContextCompat.getDrawable(this,R.drawable.shadows);

        if(drawable != null){
            Drawable movieCover = ContextCompat.getDrawable(this, R.drawable.movie);

            drawable.setDrawableByLayerId(R.id.cover_drawable, movieCover);

            ((ImageView) findViewById(R.id.imageView_cover)).setImageDrawable(drawable);
        }
    }
}
