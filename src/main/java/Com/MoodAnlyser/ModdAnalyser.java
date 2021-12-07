package Com.MoodAnlyser;

public class ModdAnalyser {

	/*Uc2:-Using try and catch to Null Exception
	 * */
	private String message;
	
	public ModdAnalyser() {
		// TODO Auto-generated constructor stub
	}
	public ModdAnalyser (String message) {
		super();
		this.message = message;
	}
	
	public String moodAnalyse() throws NullPointerException{
		try {
			String words[] = message.split(" ");
			if (words[3].equalsIgnoreCase("sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			return "HAPPY";
		}
	}
	public Object moodAnalyser(String string) {
		// TODO Auto-generated method stub
		return null;
	}
		
		
	
	}

