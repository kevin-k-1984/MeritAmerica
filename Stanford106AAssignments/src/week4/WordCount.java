package week4;

import java.io.*;

import acm.program.ConsoleProgram;
import acm.util.ErrorException;

public class WordCount extends ConsoleProgram {
	
	public void run() {
		println("File = " + "lear.txt");
		println("Lines = " + this.numberOfLines("lear.txt"));
		println("Words = " + this.numberOfWords());
		println("Chars = " + this.numberOfCharacters());
	}
	
	public int numberOfLines(String fileName) {
		BufferedReader rd = null;
		int count = 0;
		
		try {
			rd = new BufferedReader(new FileReader(fileName));
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
	
	public int numberOfWords() {
//		try {
//			BufferedReader rd = new BufferedReader(new FileReader(""));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return 0;
	}
	
	public int numberOfCharacters() {
//		try {
//			BufferedReader rd = new BufferedReader(new FileReader(""));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return 0;
	}
}
