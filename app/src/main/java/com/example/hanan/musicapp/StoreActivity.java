package com.example.hanan.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        // Find the View that shows the Home Button
        ImageButton Home= (ImageButton) findViewById(R.id.home_Btn);

        // Set a click listener on that View
        Home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Home Activity
                Intent homeIntent = new Intent(StoreActivity.this,MainActivity.class);

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
                Intent favIntent = new Intent(StoreActivity.this, FavoritesActivity.class);

                // Start the new activity
                startActivity(favIntent);
            }
        });
        // Find the View that shows the Search Button
        Button Search= (Button) findViewById(R.id.Search_Activity_Btn);
        // Set a click listener on that View
        Search.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Search Activity
                Intent searchIntent = new Intent(StoreActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });
    }
}
