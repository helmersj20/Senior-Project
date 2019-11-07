package com.example.tennisstringrecommender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Button;
import android.view.View;

public class ExperienceLevel extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btn;
    private String expStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience_level);
        radioGroup = findViewById(R.id.radioGroupExp);

    }

   public void onRadioExpClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radioBeginner:
                if (checked)
                    expStr = "Beginner";
                        break;
            case R.id.radioIntermediate:
                if (checked)
                    expStr = "Intermediate";
                        break;
            case R.id.radioAdvanced:
                if (checked)
                    expStr = "Advanced";
                        break;
        }

        Intent intent = new Intent(this, ArmInjuryHistory.class);
        intent.putExtra("radioChosen", expStr);
        startActivity(intent);
   }


}
