package com.example.tennisstringrecommender;

import com.example.tennisstringrecommender.Recommendation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecommendationTest extends Recommendation {

    String testString = "BeginnerNoLow";
    String recString = "";
    @Test
    public void beginnerNoLow() {
        recString = recommend(testString);
        Assert.assertEquals("Wilson Synthetic Gut 16 at 55 lbs", recString);
    }
}