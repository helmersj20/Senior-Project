package com.example.tennisstringrecommender;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTesting extends Recommendation{

    String testString = "BeginnerNoLow";
    String recString = "";
    @Test
    public void beginnerNoLow() {
        recString = recommend(testString);
        Assert.assertEquals("Wilson Synthetic Gut 16 at 55 lbs", recString);
    }
    @Test
    public void beginnerNoMedium() {
        testString = "BeginnerNoMedium";
        recString = recommend(testString);
        Assert.assertEquals("Wilson Sensation 16 at 55 lbs", recString);
    }
    @Test
    public void beginnerNoHigh() {
        testString = "BeginnerNoHigh";
        recString = recommend(testString);
        Assert.assertEquals("Wilson NXT 16 at 55 lbs", recString);
    }
    @Test
    public void beginnerYesLow() {
        testString = "BeginnerYesLow";
        recString = recommend(testString);
        Assert.assertEquals("Wilson Synthetic Gut 16 at 52 lbs", recString);
    }
    @Test
    public void beginnerYesMedium() {
        testString = "BeginnerYesMedium";
        recString = recommend(testString);
        Assert.assertEquals("Wilson Sensation 16 at 52 lbs", recString);
    }
    @Test
    public void beginnerYesHigh() {
        testString = "BeginnerYesHigh";
        recString = recommend(testString);
        Assert.assertEquals("Wilson NXT 16 at 52 lbs", recString);
    }
    @Test
    public void intermediateNoLow() {
        testString = "IntermediateNoLow";
        recString = recommend(testString);
        Assert.assertEquals("Luxilon Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 54 lbs", recString);
    }
    @Test
    public void intermediateNoMedium() {
        testString = "IntermediateNoMedium";
        recString = recommend(testString);
        Assert.assertEquals("Solinco Tour Bite 16 mains and Wilson NXT 16 crosses at 54 lbs", recString);
    }
    @Test
    public void intermediateNoHigh() {
        testString = "IntermediateNoHigh";
        recString = recommend(testString);
        Assert.assertEquals("Luxilon ALU Power 16 mains and Wilson NXT 16 crosses at 54 lbs", recString);
    }
    @Test
    public void intermediateYesLow() {
        testString = "IntermediateYesLow";
        recString = recommend(testString);
        Assert.assertEquals("Wilson Adrenaline 16 mains and Wilson Synthetic Gut 16 crosses at 50 lbs", recString);
    }
    @Test
    public void intermediateYesMedium() {
        testString = "IntermediateYesMedium";
        recString = recommend(testString);
        Assert.assertEquals("Wilson Adrenaline 16 mains and Wilson Sensation 16 crosses at 50 lbs", recString);
    }
    @Test
    public void intermediateYesHigh() {
        testString = "IntermediateYesHigh";
        recString = recommend(testString);
        Assert.assertEquals("Wilson ALU Power 16 mains and Wilson NXT crosses at 50 lbs", recString);
    }
    @Test
    public void advancedNoLow() {
        testString = "AdvancedNoLow";
        recString = recommend(testString);
        Assert.assertEquals("Luxilon Adrenaline Power 16 at 52 lbs", recString);
    }
    @Test
    public void advancedNoMedium() {
        testString = "AdvancedNoMedium";
        recString = recommend(testString);
        Assert.assertEquals("Solinco Tour Bite 16 at 52 lbs", recString);
    }
    @Test
    public void advancedNoHigh() {
        testString = "AdvancedNoHigh";
        recString = recommend(testString);
        Assert.assertEquals("Luxilon ALU Power 16 at 52 lbs", recString);
    }
    @Test
    public void advancedYesLow() {
        testString = "AdvancedYesLow";
        recString = recommend(testString);
        Assert.assertEquals("Luxilon Adrenaline mains and Wilson Sensation 16 crosses at 52 lbs", recString);
    }
    @Test
    public void advancedYesMedium() {
        testString = "AdvancedYesMedium";
        recString = recommend(testString);
        Assert.assertEquals("Solinco Tour Bite 16 mains and Wilson Sensation 16 crosses at 52 lbs", recString);
    }
    @Test
    public void advancedYesHigh() {
        testString = "AdvancedYesHigh";
        recString = recommend(testString);
        Assert.assertEquals("Wilson Natural Gut 16 mains and Luxilon ALU Power crosses at 52 lbs", recString);
    }
}