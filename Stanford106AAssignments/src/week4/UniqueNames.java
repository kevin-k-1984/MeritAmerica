package week4;

import acm.program.ConsoleProgram;
import acmx.export.java.util.*;

public class UniqueNames extends ConsoleProgram {
	
	ArrayList namesList;
	Iterator  namesListItr;
	
	public void run() {
		namesList = new ArrayList();
		
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			if (!namesList.contains(name)) namesList.add(name);
		}
		
		println("Unique name list contains:");
		
		for (int i = 0; i < namesList.size(); i++) {
			println(namesList.get(i));
		}
	}
	
}
