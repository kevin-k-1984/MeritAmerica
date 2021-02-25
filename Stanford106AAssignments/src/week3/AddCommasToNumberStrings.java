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
		int index = digits.length();
		int totalCommas = digits.length() % 3 == 0 ? (digits.length() / 3) - 1 : digits.length() / 3;
		
		for (int i = totalCommas; i > 0; i--) {
			result = "," +  digits.substring(index - 3, index) + result;
			index -= 3;
		}
		
		return digits.substring(0, index) + result;
	}
}
