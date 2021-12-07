package Com.MoodAnlyser;

public class ModdAnalyser {

	/*uc1:-Give a message,ability to analyze and respond Happy or Sad Mood
	 * */
	
	public String moodAnalyser(String message) {
		
		String words[]=message.split("");
		
		if (words[3].equalsIgnoreCase("sad"))
			
			return "SAD";
		return "HAPPY";
	}
	
}
