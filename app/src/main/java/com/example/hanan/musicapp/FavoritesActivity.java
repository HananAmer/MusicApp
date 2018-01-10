package com.example.hanan.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        // Find the View that shows the Home Button
        ImageButton Home= (ImageButton) findViewById(R.id.home_Btn);

        // Set a click listener on that View
        Home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Home Activity
                Intent homeIntent = new Intent( FavoritesActivity.this,MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the Store Button
        Button Store= (Button) findViewById(R.id.Store_Activity_Btn);
        // Set a click listener on that View
        Store.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the Store Activity
                Intent storeIntent = new Intent(FavoritesActivity.this, StoreActivity.class);

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
                Intent searchIntent = new Intent(FavoritesActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

    }
}
