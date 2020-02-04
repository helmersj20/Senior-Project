package com.example.tennisstringrecommender;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTesting extends Player{


    public Player testPlayer = new Player("Beginner", "No", "Low", "Low");
    public Player emptyConstructorPlayer = new Player();
    public String testRec = "";

    @Test
    public void emptyConstructor(){
        Assert.assertEquals("", emptyConstructorPlayer.getExperienceLevel());
        Assert.assertEquals("", emptyConstructorPlayer.getArmInjuryHistory());
        Assert.assertEquals("", emptyConstructorPlayer.getPriceLevel());
        Assert.assertEquals("", emptyConstructorPlayer.getPowerLevel());
    }

    @Test
    public void constructorBeginnerNoLowLow(){
        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerNowLowLow(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerNoLowLowRecommendation() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        testRec = testPlayer.recommend();
        Assert.assertEquals("Wilson Synthetic Gut 16 at 58 lbs", testRec);
    }

    @Test
    public void BeginnerNoMediumLow(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerNoMediumLowRecommendation() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Wilson Sensation 16 at 58 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerNoHighLow() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerNoHighLowRecommendation() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Wilson NXT 16 at 58 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerYesLowLow(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerYesLowLowRecommendation(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Wilson Synthetic Gut 16 at 55 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerYesMediumLow(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerYesMediumLowRecommendation(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Wilson Sensation 16 at 55 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerYesHighLow() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerYesHighLowRecommendation(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Wilson NXT 16 at 55 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateNoLowLow(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateNoLowLowRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 57 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateNoMediumLow(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateNoMediumLowRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Solinco Tour Bite 16 mains and Wilson NXT 16 crosses at 57 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateNoHighLow() {
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateNoHighLowRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Luxilon ALU Power 16 mains and Wilson NXT 16 crosses at 57 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateYesLowLow(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateYesLowLowRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 53 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateYesMediumLow(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateYesMediumLowRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Luxilon Adrenaline 16 mains and Wilson Sensation 16 crosses at 53 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateYesHighLow() {
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateYesHighLowRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Wilson ALU Power 16 mains and Wilson NXT crosses at 53 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedNoLowLow(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedNoLowLowRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Luxilon Adrenaline Power 16 at 55 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedNoMediumLow(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedNoMediumLowRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Solinco Tour Bite 16 at 55 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedNoHighLow() {
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedNoHighLowRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Luxilon ALU Power 16 at 55 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedYesLowLow(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedYesLowLowRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Luxilon Adrenaline mains and Wilson Sensation 16 crosses at 55 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedYesMediumLow(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedYesMediumLowRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Solinco Tour Bite 16 mains and Wilson Sensation 16 crosses at 55 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedYesHighLow() {
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Low", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedYesHighLowRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Low");

        Assert.assertEquals("Wilson Natural Gut 16 mains and Luxilon ALU Power crosses at 55 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerNowLowMedium(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerNoLowMediumRecommendation() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        testRec = testPlayer.recommend();
        Assert.assertEquals("Wilson Synthetic Gut 16 at 55 lbs", testRec);
    }

    @Test
    public void BeginnerNoMediumMedium(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerNoMediumMediumRecommendation() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Wilson Sensation 16 at 55 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerNoHighMedium() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        emptyConstructorPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", emptyConstructorPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerNoHighMediumRecommendation() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Wilson NXT 16 at 55 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerYesLowMedium(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerYesLowMediumRecommendation(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Wilson Synthetic Gut 16 at 52 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerYesMediumMedium(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerYesMediumMediumRecommendation(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Wilson Sensation 16 at 52 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerYesHighMedium() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerYesHighMediumRecommendation(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Wilson NXT 16 at 52 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateNoLowMedium(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateNoLowMediumRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 54 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateNoMediumMedium(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateNoMediumMediumRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Solinco Tour Bite 16 mains and Wilson NXT 16 crosses at 54 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateNoHighMedium() {
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateNoHighMediumRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Luxilon ALU Power 16 mains and Wilson NXT 16 crosses at 54 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateYesLowLoMedium(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateYesLowMediumRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 50 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateYesMediumMedium(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateYesMediumMediumRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Luxilon Adrenaline 16 mains and Wilson Sensation 16 crosses at 50 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateYesHighMedium() {
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateYesHighMediumRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Wilson ALU Power 16 mains and Wilson NXT crosses at 50 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedNoLowMedium(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedNoLowMediumRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Luxilon Adrenaline Power 16 at 52 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedNoMediumMedium(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedNoMediumMediumRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Solinco Tour Bite 16 at 52 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedNoHighMedium() {
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedNoHighMediumRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Luxilon ALU Power 16 at 52 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedYesLowMedium(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedYesLowMediumRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Luxilon Adrenaline mains and Wilson Sensation 16 crosses at 52 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedYesMediumMedium(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedYesMediumMediumRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Solinco Tour Bite 16 mains and Wilson Sensation 16 crosses at 52 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedYesHighMedium() {
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("Medium", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedYesHighMediumRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("Medium");

        Assert.assertEquals("Wilson Natural Gut 16 mains and Luxilon ALU Power crosses at 52 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerNowLowHigh(){
        emptyConstructorPlayer.setExperienceLevel("Beginner");
        emptyConstructorPlayer.setArmInjuryHistory("No");
        emptyConstructorPlayer.setPriceLevel("Low");
        emptyConstructorPlayer.setPowerLevel("High");

        Assert.assertEquals("Beginner", emptyConstructorPlayer.getExperienceLevel());
        Assert.assertEquals("No", emptyConstructorPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", emptyConstructorPlayer.getPriceLevel());
        Assert.assertEquals("High", emptyConstructorPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerNoLowHighRecommendation() {
        emptyConstructorPlayer.setExperienceLevel("Beginner");
        emptyConstructorPlayer.setArmInjuryHistory("No");
        emptyConstructorPlayer.setPriceLevel("Low");
        emptyConstructorPlayer.setPowerLevel("High");

        testRec = emptyConstructorPlayer.recommend();
        Assert.assertEquals("Wilson Synthetic Gut 16 at 52 lbs", testRec);
    }

    @Test
    public void BeginnerNoMediumHigh(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        emptyConstructorPlayer.setPowerLevel("High");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("High", emptyConstructorPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerNoMediumHighRecommendation() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Wilson Sensation 16 at 52 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerNoHighHigh() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerNoHighHighRecommendation() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Wilson NXT 16 at 52 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerYesLowHigh(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerYesLowHighRecommendation(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Wilson Synthetic Gut 16 at 49 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerYesMediumHigh(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerYesMediumHighRecommendation(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Wilson Sensation 16 at 49 lbs", testPlayer.recommend());
    }

    @Test
    public void BeginnerYesHighHigh() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void BeginnerYesHighHighRecommendation(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Wilson NXT 16 at 49 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateNoLowHigh(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateNoLowHighRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 51 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateNoMediumHigh(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateNoMediumHighRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Solinco Tour Bite 16 mains and Wilson NXT 16 crosses at 51 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateNoHighHigh() {
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateNoHighHighRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Luxilon ALU Power 16 mains and Wilson NXT 16 crosses at 51 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateYesLowHigh(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateYesLowHighRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 47 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateYesMediumHigh(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateYesMediumHighRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Luxilon Adrenaline 16 mains and Wilson Sensation 16 crosses at 47 lbs", testPlayer.recommend());
    }

    @Test
    public void IntermediateYesHighHigh() {
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void IntermediateYesHighHighRecommendation(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Wilson ALU Power 16 mains and Wilson NXT crosses at 47 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedNoLowHigh(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedNoLowHighRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Luxilon Adrenaline Power 16 at 49 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedNoMediumHigh(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedNoMediumHighRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Solinco Tour Bite 16 at 49 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedNoHighHigh() {
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedNoHighHighRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Luxilon ALU Power 16 at 49 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedYesLowHigh(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedYesLowHighRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Luxilon Adrenaline mains and Wilson Sensation 16 crosses at 49 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedYesMediumHigh(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedYesMediumHighRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Solinco Tour Bite 16 mains and Wilson Sensation 16 crosses at 49 lbs", testPlayer.recommend());
    }

    @Test
    public void AdvancedYesHighHigh() {
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
        Assert.assertEquals("High", testPlayer.getPowerLevel());
    }

    @Test
    public void AdvancedYesHighHighRecommendation(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");
        testPlayer.setPowerLevel("High");

        Assert.assertEquals("Wilson Natural Gut 16 mains and Luxilon ALU Power crosses at 49 lbs", testPlayer.recommend());
    }


}