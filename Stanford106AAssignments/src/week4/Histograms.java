package week4;

import java.io.*;

import acm.program.ConsoleProgram;
import acm.util.ErrorException;

public class Histograms extends ConsoleProgram {
	
	public void run() {
		println("00-09: " + this.printStarStrings(this.countTotalInRange("MidtermScores.txt",  0,  9)));
		println("10-19: " + this.printStarStrings(this.countTotalInRange("MidtermScores.txt",  10,  19)));
		println("20-29: " + this.printStarStrings(this.countTotalInRange("MidtermScores.txt",  20,  29)));
		println("30-39: " + this.printStarStrings(this.countTotalInRange("MidtermScores.txt",  30,  39)));
		println("40-49: " + this.printStarStrings(this.countTotalInRange("MidtermScores.txt",  40,  49)));
		println("50-59: " + this.printStarStrings(this.countTotalInRange("MidtermScores.txt",  50,  59)));
	}

	private int countTotalInRange(String fileName, int i, int j) {
		BufferedReader rd = null;
		int count = 0;
		
		try {
			
			rd = new BufferedReader(new FileReader(fileName));
			while (true) {
				String line = rd.readLine();
				if (line == null) { break; }
				int temp = Integer.valueOf(line.split(" ")[0]);
				if (temp > i && temp < j) { count++; }
			}
			rd.close();
			
		} catch (IOException e) {
			throw new ErrorException(e);
		}
		
		return count;
	}
	
	private String printStarStrings(int numOfStars) {
		String result = "";
		for (int i = 0; i < numOfStars; i++) { result += "*"; }
		return result;
	}
	
}
