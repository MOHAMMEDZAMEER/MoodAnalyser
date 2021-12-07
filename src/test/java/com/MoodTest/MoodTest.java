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
		assertEquals("SAD",M.ModdAnalyser("Iam in Sad MOOD"));
	}

	
	@Test
	public void moodHappy() {
		ModdAnalyser M = new ModdAnalyser();
		assertEquals("HAPPY",M.ModdAnalyser("Iam in Any MOOD"));
	}
	
		@Test(expected = Exception.class)
		public void moodNull() throws Exception {
			ModdAnalyser mood = new ModdAnalyser();
			mood.moodAnalyse();
	}
	
		@Test(expected = Exception.class)
		public void moodEmpty() throws Exception {
			ModdAnalyser mood = new ModdAnalyser("");
			mood.moodAnalyse();
	
}
}