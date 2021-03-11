package week5;

import java.io.*;
import java.util.*;
import acm.program.ConsoleProgram;

public class FlightPlanner extends ConsoleProgram {
	
	private HashMap<String, ArrayList<String>> tripMap = new HashMap<String, ArrayList<String>>();
	private ArrayList<String> route = new ArrayList<String>();
	private boolean buildingRoute = false;
	
	public void init() {
		this.buildTripMap("flights.txt");
		println("Welcome to Flight Planner!");
		this.printAllCitys();
		println("Let's plan a round-trip route!");
	}
	
	public void run() {
		
		while (!buildingRoute) {
			String city = readLine("Enter a starting city: ");
			if (this.tripMap.containsKey(city)) {
				this.route.add(city);
				this.buildingRoute = true;
			} else {
				println("That is not a valid starting city.");
			}
		}
		
		while (this.buildingRoute) {
			String currentCity = this.route.get(this.route.size() - 1);
			
			this.printDirectFromCity(currentCity);
			
			String nextCity = readLine("Where do you want to go from " + currentCity + "? ");
			
			if (!this.tripMap.get(currentCity).contains(nextCity)) {
				println("You can't get to that city by a direct flight.");
			} else {
				this.route.add(nextCity);
			}
			
			if (this.route.size() >= 2 && this.route.get(0).equals(this.route.get(this.route.size() - 1))) {
				this.buildingRoute = false;
			}
		}
		this.printRoute();
	}
	
	private void printAllCitys() {
		Iterator<String> citiesItr = this.tripMap.keySet().iterator();
		
		println("Here's a list of all the cities in our database:");
		while (citiesItr.hasNext()) println(citiesItr.next());
	}
	
	private void printDirectFromCity(String city) {
		Iterator<String> desinationsItr = this.tripMap.get(city).iterator();
		
		println("From " + city + " you can fly directly to:");
		while (desinationsItr.hasNext()) println(desinationsItr.next());
	}
	
	private void printRoute() {
		Iterator<String> routeItr = this.route.iterator();
		
		println("The route you've chosen is:");
		while (routeItr.hasNext()) {
			print(routeItr.next());
			if (routeItr.hasNext()) {
				print(" -> ");
			}
		}
	}

	private void buildTripMap(String file) {
		try (Scanner sc = new Scanner(new File(file))){
			while (sc.hasNext()) {
				String[] current = sc.nextLine().split(" -> ");
				if (current.length == 2) {
					if (this.tripMap.containsKey(current[0])) {
						this.tripMap.get(current[0]).add(current[1]);
					} else {
						this.tripMap.put(current[0], new ArrayList<>(Arrays.asList(current[1])));
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("No file found");
		}
	}
}
