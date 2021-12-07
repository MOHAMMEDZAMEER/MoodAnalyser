package com.MoodTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Com.MoodAnlyser.ModdAnalyser;


/*Testing the Sad and Happy scenarios and Null
 * */
public class MoodTest  {

	@Test
	public void moodSad() {
		ModdAnalyser mood = new ModdAnalyser("I am in Sad Mood");
		assertEquals("SAD", mood.moodAnalyse());

	}

	@Test
	public void moodHappy() {
		ModdAnalyser mood = new ModdAnalyser("I am in any Mood");
		assertEquals("HAPPY", mood.moodAnalyse());

	}
}