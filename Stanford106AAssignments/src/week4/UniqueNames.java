package week4;

import acm.program.ConsoleProgram;
import acmx.export.java.util.*;

public class UniqueNames extends ConsoleProgram {
	
	ArrayList namesList;
	Iterator  namesListItr;
	
	public void run() {
		namesList = new ArrayList();
		namesListItr = namesList.iterator();
		
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			if (!namesList.contains(name)) namesList.add(name);
		}
		
		println("Unique name list contains:");
		
		while (namesListItr.hasNext()) {
			println(namesListItr.next());
		}
	}
	
}
