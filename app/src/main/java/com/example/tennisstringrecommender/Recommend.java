package com.example.tennisstringrecommender;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Recommend extends AppCompatActivity {

    String message;
    TextView recTextView;
    Player player;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);
        String recString = "";
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        databaseHelper = new DatabaseHelper(this);

        Intent intent = getIntent();
        player = intent.getParcelableExtra("radioChosen");

        recString = player.recommend();

        recTextView = findViewById(R.id.recommendation);
        recTextView.setText(recString);

        final String finalRecString = recString;
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newEntry = finalRecString;
                AddData(newEntry);
//                startActivity(new Intent(MainActivity.this, ExperienceLevel.class));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Recommend.this, MainActivity.class));
            }
        });


    }

    public void AddData(String newEntry) {
        boolean insertData = databaseHelper.addData(newEntry);

        if(insertData){
            toastMessage("Recommendation Added to Database");
        }
        else{
            toastMessage("Error");
        }
    }

    private void toastMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT);
    }
//    public String recommend(String s){
//        if(s.equals("BeginnerNoLow")){
//            s = "Wilson Synthetic Gut 16 at 55 lbs";
//        }
//        else if(s.equals("BeginnerNoMedium")){
//            s = "Wilson Sensation 16 at 55 lbs";
//        }
//        else if(s.equals("BeginnerNoHigh")){
//            s = "Wilson NXT 16 at 55 lbs";
//        }
//        else if(s.equals("BeginnerYesLow")){
//            s = "Wilson Synthetic Gut 16 at 52 lbs";
//        }
//        else if(s.equals("BeginnerYesMedium")){
//            s = "Wilson Sensation 16 at 52 lbs";
//        }
//        else if(s.equals("BeginnerYesHigh")){
//            s = "Wilson NXT 16 at 52 lbs";
//        }
//        else if(s.equals("IntermediateNoLow")){
//            s = "Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 54 lbs";
//        }
//        else if(s.equals("IntermediateNoMedium")){
//            s = "Solinco Tour Bite 16 mains and Wilson NXT 16 crosses at 54 lbs";
//        }
//        else if(s.equals("IntermediateNoHigh")){
//            s = "Luxilon ALU Power 16 mains and Wilson NXT 16 crosses at 54 lbs";
//        }
//        else if(s.equals("IntermediateYesLow")){
//            s = "Wilson Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 50 lbs";
//        }
//        else if(s.equals("IntermediateYesMedium")){
//            s = "Wilson Adrenaline 16 mains and Wilson Sensation 16 crosses at 50 lbs";
//        }
//        else if(s.equals("IntermediateYesHigh")){
//            s = "Wilson ALU Power 16 mains and Wilson NXT crosses at 50 lbs";
//        }
//        else if(s.equals("AdvancedNoLow")){
//            s = "Luxilon Adrenaline Power 16 at 52 lbs";
//        }
//        else if(s.equals("AdvancedNoMedium")){
//            s = "Solinco Tour Bite 16 at 52 lbs";
//        }
//        else if(s.equals("AdvancedNoHigh")){
//            s = "Luxilon ALU Power 16 at 52 lbs";
//        }
//        else if(s.equals("AdvancedYesLow")){
//            s = "Luxilon Adrenaline mains and Wilson Sensation 16 crosses at 52 lbs";
//        }
//        else if(s.equals("AdvancedYesMedium")){
//            s = "Solinco Tour Bite 16 mains and Wilson Sensation 16 crosses at 52 lbs";
//        }
//        else{
//            s = "Wilson Natural Gut 16 mains and Luxilon ALU Power crosses at 52 lbs";
//        }
//        return s;
//    }



}
