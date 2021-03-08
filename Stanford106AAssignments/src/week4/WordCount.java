package week4;

import java.io.*;

import acm.program.ConsoleProgram;
import acm.util.ErrorException;

public class WordCount extends ConsoleProgram {
	
	public void run() {
		println("File = lear.txt");
		println("Lines = " + this.numberOfLines("lear.txt"));
		println("Words = " + this.numberOfWords("lear.txt"));
		println("Chars = " + this.numberOfCharacters("lear.txt"));
	}
	
	public int numberOfLines(String fileName) {
		int count = 0;
		
		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			while (true) {
				if (rd.readLine() == null) { break; }
				count++;
			}
			rd.close();
		} catch (IOException e) {
			throw new ErrorException(e);
		}
		
		return count;
	}
	
	public int numberOfWords(String fileName) {
		int count = 0;
		
		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			while (true) {
				String line = rd.readLine();
				if (line == null) { break; }
				String[] delimLine = line.split("[ ,]");
				count += delimLine.length;
			}
			rd.close();
		} catch (IOException e) {
			throw new ErrorException(e);
		}
		
		return count;
	}
	
	public int numberOfCharacters(String fileName) {
		int count = 0;
		
		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			while (true) {
				String line = rd.readLine();
				if (line == null) { break; }
				count += line.substring(0, line.length() - 1).length();
			}
			rd.close();
		} catch (IOException e) {
			throw new ErrorException(e);
		}
		
		return count;
	}
}
