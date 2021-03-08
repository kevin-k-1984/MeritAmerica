package week4;

import acm.program.*;
import java.util.*;

public class MidtermConsole extends ConsoleProgram {

	public void init() {
		println("This program finds the two largest integers in a ");
		println("list. Enter values, one per line, using a 0 to ");
		println("signal the end of the list.");
	}
	
	public void run() {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			int value = readInt(" ? ");
			if (value == 0) break; 
			
			list.add(value);
		}
		
		Collections.sort(list);
		println("The largest value is: " + list.get(list.size() - 1));
		println("The second largest is: " + list.get(list.size() - 2));
	}
}
