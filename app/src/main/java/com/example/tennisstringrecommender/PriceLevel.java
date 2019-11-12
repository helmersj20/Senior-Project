package com.example.tennisstringrecommender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class PriceLevel extends AppCompatActivity {

    String message;
    String priceStr;
    String recString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_level);

        Intent intent = getIntent();
        message = intent.getStringExtra("radioChosen");
    }

    public void onRadioPriceClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radioLow:
                if (checked)
                    priceStr = "Low";
                break;
            case R.id.radioMedium:
                if (checked)
                    priceStr = "Medium";
                break;
            case R.id.radioHigh:
                if (checked)
                    priceStr = "High";
                break;
        }

        recString = message + priceStr;
        Intent intent = new Intent(this, Recommendation.class);
        intent.putExtra("radioChosen", recString);
        startActivity(intent);

    }
}
