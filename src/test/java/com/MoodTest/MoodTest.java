package com.MoodTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Com.MoodAnlyser.ModdAnalyser;
import Com.MoodAnlyserException.Exception;


/*Testing the Sad and Happy scenarios
 * */
public class MoodTest  {

	@Test
	public void moodSad() {
		ModdAnalyser M = new ModdAnalyser();
		assertEquals("SAD",M.moodAnalyser("Iam in Sad MOOD"));
	}

	
	@Test
	public void moodHappy() {
		ModdAnalyser M = new ModdAnalyser();
		assertEquals("HAPPY",M.moodAnalyser("Iam in Any MOOD"));
	}
	/*Giving Null MOOD it Should Return HAPPY
	 * */
	public void moodNull() throws Exception {
		ModdAnalyser M = new ModdAnalyser();
		assertEquals("HAPPY", M.moodAnalyse());
	}
}