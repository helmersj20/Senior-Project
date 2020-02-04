package com.example.tennisstringrecommender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class ArmInjuryHistory extends AppCompatActivity {


    Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm_injury_history);

        Intent intent = getIntent();
        player = intent.getParcelableExtra("radioChosen");


    }

    //Sets the ArmInjuryHistory of the player and moves to the PriceLevel Screen
    public void onRadioArmClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radioArmNo:
                if (checked)
                    player.setArmInjuryHistory("No");
                break;
            case R.id.radioArmYes:
                if (checked)
                    player.setArmInjuryHistory("Yes");
                break;
        }

        Intent intent = new Intent(this, PriceLevel.class);
        intent.putExtra("radioChosen", player);
        startActivity(intent);
    }


}
