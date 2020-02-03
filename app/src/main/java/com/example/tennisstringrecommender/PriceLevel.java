package com.example.tennisstringrecommender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class PriceLevel extends AppCompatActivity {

    Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_level);

        Intent intent = getIntent();
        player = intent.getParcelableExtra("radioChosen");
    }

    //Sets the players priceLevel and moves the user to the power level activity
    public void onRadioPriceClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radioLow:
                if (checked)
                    player.setPriceLevel("Low");
                break;
            case R.id.radioMedium:
                if (checked)
                    player.setPriceLevel("Medium");
                break;
            case R.id.radioHigh:
                if (checked)
                    player.setPriceLevel("High");
                break;
        }

        Intent intent = new Intent(this, PowerLevel.class);
        intent.putExtra("radioChosen", player);
        startActivity(intent);

    }
}
