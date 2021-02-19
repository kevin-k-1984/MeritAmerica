package week2;

import acm.program.*;
import acm.util.*;
import acm.graphics.*;

public class RandomCircles extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int counter = 0;
		//setSize(300, 200);
		
		while (counter < 10) {
			GOval cir = makeCircle();
			int xLocation = rgen.nextInt(0, getWidth());
			int yLocation = rgen.nextInt(0, getHeight());
			
			if (xLocation + cir.getWidth() < getWidth() && yLocation + cir.getHeight() < getHeight()) {
				add(cir, xLocation, yLocation);
				counter++;
			}
		}
				
	}

	private GOval makeCircle() {
		int cirSize = rgen.nextInt(5, 50);
		GOval circle = new GOval(cirSize, cirSize);
		circle.setFilled(true);
		circle.setFillColor(rgen.nextColor());
		return circle;
	}

}
