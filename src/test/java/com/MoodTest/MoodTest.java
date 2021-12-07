package com.MoodTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Com.MoodAnlyser.ModdAnalyser;

/*TC1.1:-Should return Sad "I am in Sad MOOd"
 * */

public class MoodTest  {

	@Test
	public void moodSad() {
		ModdAnalyser M = new ModdAnalyser();
		assertEquals("SAD", M.moodAnalyser("Iam in Sad MOOd"));
	}
	/*
	 * Tc1.2 should Return Happy "I am in Any MOOD" 
	 * */
	@Test
	public void moodHappy() {
		ModdAnalyser M = new ModdAnalyser();
		assertEquals("HAPPY", M.moodAnalyser("Iam in Any MOOD"));
	}
}