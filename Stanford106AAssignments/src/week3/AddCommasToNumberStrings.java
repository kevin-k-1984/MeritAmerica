package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
		}
	}
	
	private String addCommasToNumericString(String digits) {
		String result = "";
	    
		for (int i = digits.length() - 1; i >= 0; i--) {
	        char tempChar = digits.charAt(i);
	        result = tempChar + result;
	        if ((digits.length() - i) % 3 == 0 && i > 0) { 
	        	result = "," + result; 
	        }
	    }

	    return result;
	}
}
