package week3;

import java.util.*;

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
		char[] asChars = digits.toCharArray();
		Stack<Character> st = new Stack<Character>();
		
		
		for (int i = asChars.length - 1; i >= 0; i--) { 
			st.push(a); 
		}
		
		char[] withCommas = new char[st.size()];
		
		for (int i = withCommas.length - 1; i >= 0; i--) {
			withCommas[i] = st.pop();
		}
		
		return new String(withCommas);
	}
	
}
