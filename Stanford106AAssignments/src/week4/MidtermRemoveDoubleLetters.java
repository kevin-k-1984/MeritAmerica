package week4;

import acm.program.ConsoleProgram;

public class MidtermRemoveDoubleLetters extends ConsoleProgram {

	public void run() {
		while(true) {
			String input = readLine("Enter a word with double letters: ");
			if (input.length() == 0) break;
			println(removeDoubleLetters(input));
		}
	}
	
	public String removeDoubleLetters(String str) {
		String result = "";
		for (char x: str.toCharArray()) {
			if (result.indexOf(x) < 0) result += x; 
		}
		return result;
	}
}
