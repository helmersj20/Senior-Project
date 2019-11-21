package com.example.tennisstringrecommender;

public class Player {
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
