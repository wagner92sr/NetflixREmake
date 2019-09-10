package com.wagnerrodrigues.netflixremake;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_main);

    }

    private static class MovieHolder extends RecyclerView.ViewHolder{

        public MovieHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private class MainAdapter extends RecyclerView.Adapter<MovieHolder>{

        @NonNull
        @Override
        public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull MovieHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }


}
