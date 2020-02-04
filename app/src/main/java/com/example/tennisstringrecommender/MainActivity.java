package com.example.tennisstringrecommender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button beginButton = (Button) findViewById(R.id.beginButton);
        Button prevRecButton = (Button) findViewById(R.id.prevRecButton);
        databaseHelper = new DatabaseHelper(this);

        //Starts the questionare process
        beginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ExperienceLevel.class));
            }
        });

        //Sends user to list view populated by database
        prevRecButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DatabaseView.class));
            }
        });
    }

    public void AddData(String newEntry) {
        boolean insertData = databaseHelper.addData(newEntry);
    }
}
