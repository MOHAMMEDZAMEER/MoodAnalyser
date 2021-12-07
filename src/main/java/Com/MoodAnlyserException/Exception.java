package Com.MoodAnlyserException;

import java.rmi.AccessException;

public class Exception extends AccessException {

	/*In case of NULL or Empty Mood throw Custom Exception MoodAnalysisException*/
	public Exception() {
		// TODO Auto-generated constructor stub
		super(null);
	}
	
	public Exception(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
	public Exception(String message, Throwable t) {
		// TODO Auto-generated constructor stub
		super(message,(java.lang.Exception) t);
	}
}
