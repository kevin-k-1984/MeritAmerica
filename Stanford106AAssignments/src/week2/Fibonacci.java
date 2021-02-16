package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static final int MAX_TERM_VALUE = 10000;

	public void run() {
		
		printFibSequence(MAX_TERM_VALUE);
		
	}
	
	private void printFibSequence(int largestNumber) {
		
		int fib1 = 0;
		int fib2 = 1;
		
		println("This program lists the Fibonacci sequence.");
		
		while (fib1 < largestNumber) {
			println(fib1);
			
			int fibSwap = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibSwap;
		}
	}
}
