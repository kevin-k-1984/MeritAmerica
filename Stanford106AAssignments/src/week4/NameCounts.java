package week4;

import java.util.*;

import acm.program.ConsoleProgram;

public class NameCounts extends ConsoleProgram {
	
	public void run() {
		
		HashMap<String, Integer> nameList = new HashMap<String, Integer>();
		
		while (true) {
			String name = readLine("Enter name: ");
			if (name.isEmpty()) break;
			
			if (nameList.containsKey(name)) {
				nameList.put(name, nameList.get(name).intValue() + 1);
			} else {
				nameList.put(name, 1);
			}
		}
		
		Iterator<String> nameListItr = nameList.keySet().iterator();
		
		while (nameListItr.hasNext()) {
			String currentName = nameListItr.next();
			println("Entry [" + currentName + "] has count " + nameList.get(currentName));
		}
	}
	
}
