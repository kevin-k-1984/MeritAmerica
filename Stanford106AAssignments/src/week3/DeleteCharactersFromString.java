package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {
		println(removeAllOccurrences("This is a test", 't'));
		println(removeAllOccurrences("Summer is here!", 'e'));
		println(removeAllOccurrences("---0---", '-'));
	}

	private String removeAllOccurrences(String string, char c) {
		String result = "";
		for (char current: string.toCharArray()) {
			if (current != c) { result += current;}
		}
		return result;
	}
}
