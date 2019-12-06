package com.example.tennisstringrecommender;

import android.os.Parcel;
import android.os.Parcelable;

public class Player implements Parcelable {
    public String experienceLevel;
    public String armInjuryHistory;
    public String priceLevel;

    public Player(){
        this.experienceLevel = "";
        this.armInjuryHistory = "";
        this.priceLevel = "";
    }

    public Player(String exp, String arm, String price){
        this.experienceLevel = exp;
        this.armInjuryHistory = arm;
        this.priceLevel = price;
    }

    protected Player(Parcel in) {
        experienceLevel = in.readString();
        armInjuryHistory = in.readString();
        priceLevel = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(experienceLevel);
        dest.writeString(armInjuryHistory);
        dest.writeString(priceLevel);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public void setArmInjuryHistory(String armInjuryHistory) {
        this.armInjuryHistory = armInjuryHistory;
    }

    public void setPriceLevel(String priceLevel) {
        this.priceLevel = priceLevel;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public String getArmInjuryHistory() {
        return armInjuryHistory;
    }

    public String getPriceLevel() {
        return priceLevel;
    }

    public String recommend(){
        String recommendation = "";
        switch(this.experienceLevel){
            case "Beginner":
                switch(this.armInjuryHistory){
                    case "No":
                        switch(this.priceLevel){
                            case "Low":
                                recommendation = "Wilson Synthetic Gut 16 at 55 lbs";
                                return recommendation;
                            case "Medium":
                                recommendation = "Wilson Sensation 16 at 55 lbs";
                                return recommendation;
                            case "High":
                                recommendation = "Wilson NXT 16 at 55 lbs";
                                return recommendation;
                        }
                    case "Yes":
                        switch(this.priceLevel){
                            case "Low":
                                recommendation = "Wilson Synthetic Gut 16 at 52 lbs";
                                return recommendation;
                            case "Medium":
                                recommendation = "Wilson Sensation 16 at 52 lbs";
                                return recommendation;
                            case "High":
                                recommendation = "Wilson NXT 16 at 52 lbs";
                                return recommendation;
                        }


                }
            case "Intermediate":
                switch(this.armInjuryHistory){
                    case "No":
                        switch(this.priceLevel){
                            case "Low":
                                recommendation = "Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 54 lbs";
                                return recommendation;
                            case "Medium":
                                recommendation = "Solinco Tour Bite 16 mains and Wilson NXT 16 crosses at 54 lbs";
                                return recommendation;
                            case "High":
                                recommendation = "Luxilon ALU Power 16 mains and Wilson NXT 16 crosses at 54 lbs";
                                return recommendation;
                        }
                    case "Yes":
                        switch(this.priceLevel){
                            case "Low":
                                recommendation = "Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 50 lbs";
                                return recommendation;
                            case "Medium":
                                recommendation = "Luxilon Adrenaline 16 mains and Wilson Sensation 16 crosses at 50 lbs";
                                return recommendation;
                            case "High":
                                recommendation = "Wilson ALU Power 16 mains and Wilson NXT crosses at 50 lbs";
                                return recommendation;
                        }


                }
            case "Advanced":
                switch(this.armInjuryHistory){
                    case "No":
                        switch(this.priceLevel){
                            case "Low":
                                recommendation = "Luxilon Adrenaline Power 16 at 52 lbs";
                                return recommendation;
                            case "Medium":
                                recommendation = "Solinco Tour Bite 16 at 52 lbs";
                                return recommendation;
                            case "High":
                                recommendation = "Luxilon ALU Power 16 at 52 lbs";
                                return recommendation;
                        }
                    case "Yes":
                        switch(this.priceLevel){
                            case "Low":
                                recommendation = "Luxilon Adrenaline mains and Wilson Sensation 16 crosses at 52 lbs";
                                return recommendation;
                            case "Medium":
                                recommendation = "Solinco Tour Bite 16 mains and Wilson Sensation 16 crosses at 52 lbs";
                                return recommendation;
                            case "High":
                                recommendation = "Wilson Natural Gut 16 mains and Luxilon ALU Power crosses at 52 lbs";
                                return recommendation;
                        }


                }
        }
        return recommendation;
    }
}
