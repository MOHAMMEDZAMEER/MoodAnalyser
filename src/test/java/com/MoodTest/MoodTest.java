package com.MoodTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Com.MoodAnlyser.ModdAnalyser;

/*TC1.1:-Should return Sad "iam in Sad Modd"
 * */

public class MoodTest  {

	@Test
	public void moodsad() {
		ModdAnalyser M = new ModdAnalyser();
		assertEquals("SAD", M.moodAnalyser("Iam in Sad MOOd"));
	}
	
}