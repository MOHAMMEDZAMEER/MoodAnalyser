package Com.MoodAnlyser;
public class ModdAnalyser {

	
	private String message;
	
	public ModdAnalyser() {
		// TODO Auto-generated constructor stub
	}
	public ModdAnalyser (String message) {
		super();
		this.message = message;
	}

	public String moodAnalyse() {

		String words[] = message.split(" ");
		if (words[3].equalsIgnoreCase("sad"))
			return "SAD";
		return "HAPPY";
	}
	
}

