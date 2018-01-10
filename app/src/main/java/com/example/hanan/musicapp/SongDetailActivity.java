package com.example.hanan.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SongDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);

        // Find the View that shows the Home Button
        ImageButton Home= (ImageButton) findViewById(R.id.home_Btn);

        // Set a click listener on that View
        Home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Home Activity
                Intent homeIntent = new Intent( SongDetailActivity.this,MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });
        // Find the View that shows the Favorites Button
        Button Favorites= (Button) findViewById(R.id.favorites_Activity_Btn);

        // Set a click listener on that View
        Favorites.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Favorites Activity
                Intent favIntent = new Intent(SongDetailActivity.this, FavoritesActivity.class);

                // Start the new activity
                startActivity(favIntent);
            }
        });

        // Find the View that shows the Store Button
        Button Store= (Button) findViewById(R.id.Store_Activity_Btn);
        // Set a click listener on that View
        Store.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Store Activity
                Intent storeIntent = new Intent(SongDetailActivity.this, StoreActivity.class);

                // Start the new activity
                startActivity(storeIntent);
            }
        });

        // Find the View that shows the Search Button
        Button Search= (Button) findViewById(R.id.Search_Activity_Btn);
        // Set a click listener on that View
        Search.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Search Activity
                Intent searchIntent = new Intent(SongDetailActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        final ImageButton fav_off=(ImageButton) findViewById(R.id.favorite_off);
        fav_off.setVisibility(View.VISIBLE);

        final ImageButton fav_on=(ImageButton) findViewById(R.id.favorite_on);
        fav_on.setVisibility(View.INVISIBLE);

        // if the user clicked on favorite Btn while it's off it turns ON
        fav_off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
               fav_on.setVisibility(View.VISIBLE);
                fav_off.setVisibility(View.INVISIBLE);
            }
        });

        // if the user clicked on favorite Btn while it's on it turns OFF
        fav_on.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                fav_off.setVisibility(View.VISIBLE);
                fav_on.setVisibility(View.INVISIBLE);
            }
        });
    }
}
