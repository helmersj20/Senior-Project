package com.example.tennisstringrecommender;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditDataActivity extends AppCompatActivity {

    private static final String TAG = "EditDataActivity";

    private Button deleteButton;
    private Button dbFromEditButton;
    private TextView dataText;

    DatabaseHelper databaseHelper;

    private String selectedName;
    private int selectedID;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);
        deleteButton = (Button) findViewById(R.id.button5);
        dbFromEditButton = (Button) findViewById(R.id.button6);
        dataText = (TextView) findViewById(R.id.textView3);
        databaseHelper = new DatabaseHelper(this);

        Intent receivedIntent = getIntent();

        selectedID = receivedIntent.getIntExtra("id",-1);
        selectedName = receivedIntent.getStringExtra("name");
        dataText.setText(selectedName);

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseHelper.deleteName(selectedID,selectedName);
                dataText.setText("");
            }
        });

        dbFromEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EditDataActivity.this, DatabaseView.class));
            }
        });
    }


}
