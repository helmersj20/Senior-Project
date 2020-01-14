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


    public Player testPlayer = new Player("Beginner", "No", "Low");
    public Player emptyConstructorPlayer = new Player();
    public String testRec = "";

    @Test
    public void emptyConstructor(){
        Assert.assertEquals("", emptyConstructorPlayer.getExperienceLevel());
        Assert.assertEquals("", emptyConstructorPlayer.getArmInjuryHistory());
        Assert.assertEquals("", emptyConstructorPlayer.getPriceLevel());
    }

    @Test
    public void constructorBeginnerNowLow(){
        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
    }

    @Test
    public void BeginnerNowLow(){
        emptyConstructorPlayer.setExperienceLevel("Beginner");
        emptyConstructorPlayer.setArmInjuryHistory("No");
        emptyConstructorPlayer.setPriceLevel("Low");

        Assert.assertEquals("Beginner", emptyConstructorPlayer.getExperienceLevel());
        Assert.assertEquals("No", emptyConstructorPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", emptyConstructorPlayer.getPriceLevel());
    }

//    @Test
//    public void BeginnerNoLowRecommendation() {
//        testRec = emptyConstructorPlayer.recommend();
//        Assert.assertEquals("Wilson Synthetic Gut 16 at 55 lbs", testRec);
//    }

    @Test
    public void BeginnerNoMedium(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
    }

//    @Test
//    public void BeginnerNoMediumRecommendation() {
//        Assert.assertEquals("Wilson Sensation 16 at 55 lbs", testPlayer.recommend());
//    }

    @Test
    public void BeginnerNoHigh() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
    }

//    @Test
//    public void BeginnerNoHighRecommendation() {
//        Assert.assertEquals("Wilson NXT 16 at 55 lbs", testPlayer.recommend());
//    }

    @Test
    public void BeginnerYesLow(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
    }

    @Test
    public void BeginnerYesMedium(){
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
    }

    @Test
    public void BeginnerYesHigh() {
        testPlayer.setExperienceLevel("Beginner");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");

        Assert.assertEquals("Beginner", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
    }

    @Test
    public void IntermediateNoLow(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
    }

    @Test
    public void IntermediateNoMedium(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
    }

    @Test
    public void IntermediateNoHigh() {
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
    }

    @Test
    public void IntermediateYesLow(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
    }

    @Test
    public void IntermediateYesMedium(){
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
    }

    @Test
    public void IntermediateYesHigh() {
        testPlayer.setExperienceLevel("Intermediate");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");

        Assert.assertEquals("Intermediate", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
    }

    @Test
    public void AdvancedNoLow(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Low");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
    }

    @Test
    public void AdvancedNoMedium(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("Medium");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
    }

    @Test
    public void AdvancedNoHigh() {
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("No");
        testPlayer.setPriceLevel("High");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("No", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
    }

    @Test
    public void AdvancedYesLow(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Low");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Low", testPlayer.getPriceLevel());
    }

    @Test
    public void AdvancedYesMedium(){
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("Medium");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("Medium", testPlayer.getPriceLevel());
    }

    @Test
    public void AdvancedYesHigh() {
        testPlayer.setExperienceLevel("Advanced");
        testPlayer.setArmInjuryHistory("Yes");
        testPlayer.setPriceLevel("High");

        Assert.assertEquals("Advanced", testPlayer.getExperienceLevel());
        Assert.assertEquals("Yes", testPlayer.getArmInjuryHistory());
        Assert.assertEquals("High", testPlayer.getPriceLevel());
    }
//    @Test
//    public void beginnerNoLow(){
//        recString = testPlayer.recommend();
//        System.out.println(recString);
//        Assert.assertEquals("Wilson Synthetic Gut 16 at 55 lbs", recString);
//    }

//    String testString = "BeginnerNoLow";
//    String recString = "";
//    @Test
//    public void beginnerNoLow() {
//        recString = recommend(testString);
//        Assert.assertEquals("Wilson Synthetic Gut 16 at 55 lbs", recString);
//    }
//    @Test
//    public void beginnerNoMedium() {
//        testString = "BeginnerNoMedium";
//        recString = recommend(testString);
//        Assert.assertEquals("Wilson Sensation 16 at 55 lbs", recString);
//    }
//    @Test
//    public void beginnerNoHigh() {
//        testString = "BeginnerNoHigh";
//        recString = recommend(testString);
//        Assert.assertEquals("Wilson NXT 16 at 55 lbs", recString);
//    }
//    @Test
//    public void beginnerYesLow() {
//        testString = "BeginnerYesLow";
//        recString = recommend(testString);
//        Assert.assertEquals("Wilson Synthetic Gut 16 at 52 lbs", recString);
//    }
//    @Test
//    public void beginnerYesMedium() {
//        testString = "BeginnerYesMedium";
//        recString = recommend(testString);
//        Assert.assertEquals("Wilson Sensation 16 at 52 lbs", recString);
//    }
//    @Test
//    public void beginnerYesHigh() {
//        testString = "BeginnerYesHigh";
//        recString = recommend(testString);
//        Assert.assertEquals("Wilson NXT 16 at 52 lbs", recString);
//    }
//    @Test
//    public void intermediateNoLow() {
//        testString = "IntermediateNoLow";
//        recString = recommend(testString);
//        Assert.assertEquals("Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 54 lbs", recString);
//    }
//    @Test
//    public void intermediateNoMedium() {
//        testString = "IntermediateNoMedium";
//        recString = recommend(testString);
//        Assert.assertEquals("Solinco Tour Bite 16 mains and Wilson NXT 16 crosses at 54 lbs", recString);
//    }
//    @Test
//    public void intermediateNoHigh() {
//        testString = "IntermediateNoHigh";
//        recString = recommend(testString);
//        Assert.assertEquals("Luxilon ALU Power 16 mains and Wilson NXT 16 crosses at 54 lbs", recString);
//    }
//    @Test
//    public void intermediateYesLow() {
//        testString = "IntermediateYesLow";
//        recString = recommend(testString);
//        Assert.assertEquals("Wilson Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 50 lbs", recString);
//    }
//    @Test
//    public void intermediateYesMedium() {
//        testString = "IntermediateYesMedium";
//        recString = recommend(testString);
//        Assert.assertEquals("Wilson Adrenaline 16 mains and Wilson Sensation 16 crosses at 50 lbs", recString);
//    }
//    @Test
//    public void intermediateYesHigh() {
//        testString = "IntermediateYesHigh";
//        recString = recommend(testString);
//        Assert.assertEquals("Wilson ALU Power 16 mains and Wilson NXT crosses at 50 lbs", recString);
//    }
//    @Test
//    public void advancedNoLow() {
//        testString = "AdvancedNoLow";
//        recString = recommend(testString);
//        Assert.assertEquals("Luxilon Adrenaline Power 16 at 52 lbs", recString);
//    }
//    @Test
//    public void advancedNoMedium() {
//        testString = "AdvancedNoMedium";
//        recString = recommend(testString);
//        Assert.assertEquals("Solinco Tour Bite 16 at 52 lbs", recString);
//    }
//    @Test
//    public void advancedNoHigh() {
//        testString = "AdvancedNoHigh";
//        recString = recommend(testString);
//        Assert.assertEquals("Luxilon ALU Power 16 at 52 lbs", recString);
//    }
//    @Test
//    public void advancedYesLow() {
//        testString = "AdvancedYesLow";
//        recString = recommend(testString);
//        Assert.assertEquals("Luxilon Adrenaline mains and Wilson Sensation 16 crosses at 52 lbs", recString);
//    }
//    @Test
//    public void advancedYesMedium() {
//        testString = "AdvancedYesMedium";
//        recString = recommend(testString);
//        Assert.assertEquals("Solinco Tour Bite 16 mains and Wilson Sensation 16 crosses at 52 lbs", recString);
//    }
//    @Test
//    public void advancedYesHigh() {
//        testString = "AdvancedYesHigh";
//        recString = recommend(testString);
//        Assert.assertEquals("Wilson Natural Gut 16 mains and Luxilon ALU Power crosses at 52 lbs", recString);
//    }
}