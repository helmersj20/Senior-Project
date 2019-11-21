package com.example.tennisstringrecommender;

import android.os.Parcel;
import android.os.Parcelable;

public class Player implements Parcelable {
    public String experienceLevel;
    public Boolean armInjuryHistory;
    public String priceLevel;

    public Player(){
        this.experienceLevel = "";
        this.armInjuryHistory = Boolean.FALSE;
        this.priceLevel = "";
    }

    public Player(String exp, Boolean arm, String price){
        this.experienceLevel = exp;
        this.armInjuryHistory = arm;
        this.priceLevel = price;
    }

    protected Player(Parcel in) {
        experienceLevel = in.readString();
        byte tmpArmInjuryHistory = in.readByte();
        armInjuryHistory = tmpArmInjuryHistory == 0 ? null : tmpArmInjuryHistory == 1;
        priceLevel = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(experienceLevel);
        dest.writeByte((byte) (armInjuryHistory == null ? 0 : armInjuryHistory ? 1 : 2));
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

    public void setArmInjuryHistory(Boolean armInjuryHistory) {
        this.armInjuryHistory = armInjuryHistory;
    }

    public void setPriceLevel(String priceLevel) {
        this.priceLevel = priceLevel;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public Boolean getArmInjuryHistory() {
        return armInjuryHistory;
    }

    public String getPriceLevel() {
        return priceLevel;
    }
}
