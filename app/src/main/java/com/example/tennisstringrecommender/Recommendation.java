package com.example.tennisstringrecommender;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Recommendation extends AppCompatActivity {

    String message;
    TextView recTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);

        Intent intent = getIntent();
        message = intent.getStringExtra("radioChosen");

        recTextView = findViewById(R.id.recommendation);
        recTextView.setText(message);
        recommend();


    }
    public void recommend(){
        if(message.equals("BeginnerNoLow")){
            recTextView.setText("Wilson Synthetic Gut 16 at 55 lbs");
        }
        else if(message.equals("BeginnerNoMedium")){
            recTextView.setText("Wilson Sensation 16 at 55 lbs");
        }
        else if(message.equals("BeginnerNoHigh")){
            recTextView.setText("Wilson NXT 16 at 55 lbs");
        }
        else if(message.equals("BeginnerYesLow")){
            recTextView.setText("Wilson Synthetic Gut 16 at 52 lbs");
        }
        else if(message.equals("BeginnerYesMedium")){
            recTextView.setText("Wilson Sensation 16 at 52 lbs");
        }
        else if(message.equals("BeginnerYesHigh")){
            recTextView.setText("Wilson NXT 16 at 52 lbs");
        }
        else if(message.equals("IntermediateNoLow")){
            recTextView.setText("Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 54 lbs");
        }
        else if(message.equals("IntermediateNoMedium")){
            recTextView.setText("Solinco Tour Bite 16 mains and Wilson NXT 16 crosses at 54 lbs");
        }
        else if(message.equals("IntermediateNoHigh")){
            recTextView.setText("Luxilon ALU Power 16 mains and Wilson NXT 16 crosses at 54 lbs");
        }
        else if(message.equals("IntermediateYesLow")){
            recTextView.setText("Wilson Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 50 lbs");
        }
        else if(message.equals("IntermediateYesMedium")){
            recTextView.setText("Wilson Adrenaline 16 mains and Wilson Sensation 16 crosses at 50 lbs");
        }
        else if(message.equals("IntermediateYesHigh")){
            recTextView.setText("Wilson ALU Power 16 mains and Wilson NXT crosses at 50 lbs");
        }
        else if(message.equals("AdvancedNoLow")){
            recTextView.setText("Luxilon Adrenaline Power 16 at 52 lbs");
        }
        else if(message.equals("AdvancedNoMedium")){
            recTextView.setText("Solinco Tour Bite 16 at 52 lbs");
        }
        else if(message.equals("AdvancedNoHigh")){
            recTextView.setText("Luxilon ALU Power 16 at 52 lbs");
        }
        else if(message.equals("AdvancedYesLow")){
            recTextView.setText("Luxilon Adrenaline mains and Wilson Sensation 16 crosses at 52 lbs");
        }
        else if(message.equals("AdvancedYesMedium")){
            recTextView.setText("Solinco Tour Bite 16 mains and Wilson Sensation 16 crosses at 52 lbs");
        }
        else{
            recTextView.setText("Wilson Natural Gut 16 mains and Luxilon ALU Power crosses at 52 lbs");
        }
    }



}
