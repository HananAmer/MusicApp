package com.example.hanan.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Find the View that shows the Home Button
        ImageButton Home= (ImageButton) findViewById(R.id.home_Btn);

        // Set a click listener on that View
        Home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Home Activity
                Intent homeIntent = new Intent(SearchActivity.this,MainActivity.class);

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
                Intent favIntent = new Intent(SearchActivity.this, FavoritesActivity.class);

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
                Intent storeIntent = new Intent(SearchActivity.this, StoreActivity.class);

                // Start the new activity
                startActivity(storeIntent);
            }
        });

    }
}
