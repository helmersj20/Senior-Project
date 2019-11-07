package com.example.tennisstringrecommender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class ArmInjuryHistory extends AppCompatActivity {

    String armStr;
    String recStr;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm_injury_history);

        Intent intent = getIntent();
        message = intent.getStringExtra("radioChosen");


    }

    public void onRadioArmClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radioArmNo:
                if (checked)
                    armStr = message+"No";
                break;
            case R.id.radioArmYes:
                if (checked)
                    armStr = message+"Yes";
                break;
        }

        recStr = message + armStr;
        Intent intent = new Intent(this, PriceLevel.class);
        intent.putExtra("radioChosen", armStr);
        startActivity(intent);
    }


}
