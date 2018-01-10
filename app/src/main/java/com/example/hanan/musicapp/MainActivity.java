package com.example.hanan.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Favorites Button
        Button Favorites= (Button) findViewById(R.id.favorites_Activity_Btn);

        // Set a click listener on that View
        Favorites.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Favorites Activity
                Intent favIntent = new Intent(MainActivity.this, FavoritesActivity.class);

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
                Intent storeIntent = new Intent(MainActivity.this, StoreActivity.class);

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
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the detail Button
        TextView item =(TextView) findViewById(R.id.song_item);
        // Set a click listener on that View
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Detail Activity}
                Intent detailIntent = new Intent(MainActivity.this, SongDetailActivity.class);

                // Start the new activity
                startActivity(detailIntent);
            }
        });

    }
}
