package com.example.tennisstringrecommender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class PowerLevel extends AppCompatActivity {

    Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_level);

        Intent intent = getIntent();
        player = intent.getParcelableExtra("radioChosen");
    }

    public void onRadioPowerClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.powerLow:
                if (checked)
                    player.setPowerLevel("Low");
                break;
            case R.id.powerMedium:
                if (checked)
                    player.setPowerLevel("Medium");
                break;
            case R.id.powerHigh:
                if (checked)
                    player.setPowerLevel("High");
                break;
        }

        Intent intent = new Intent(this, Recommend.class);
        intent.putExtra("radioChosen", player);
        startActivity(intent);

    }
}
