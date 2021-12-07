package Com.MoodAnlyser;
import Com.MoodAnlyserException.Exception;
public class ModdAnalyser {

	
	private String message;
	
	public ModdAnalyser() {
		// TODO Auto-generated constructor stub
	}
	public ModdAnalyser (String message) {
		super();
		this.message = message;
	}
	
	public String moodAnalyse() throws  Exception{
		if (message == null)
			throw new Exception(" The string is null");
		if (message.equals(""))
			throw new Exception(" The string is empty");

		String words[] = message.split(" ");
		if (words[3].equalsIgnoreCase("sad"))
			return "SAD";
		return "HAPPY";
	}
	
	
}

