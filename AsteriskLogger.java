package week5codingproject;

public class AsteriskLogger implements Logger {



	@Override
	public void log(String str) {

	System.out.println("***" + str + "***");
	}

	@Override
	public void error(String str) {
		String error = "Error: " + str;
		int length = error.length() + 6;
		StringBuilder line = new StringBuilder();
		
	for (int i = 1; i<= length; i++); {
		
	}
	System.out.println(line.toString());
	
	log(error);
	
	System.out.println(line.toString());
	}
@Override
public void Error(String error) {
	System.err.println("****************");
	System.err.println("***Error: " + error + "***" );
	System.err.println("****************");
	System.out.println();
	
	
}}