package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		move();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				clearBeepers();
			}
			move();
			if (frontIsClear()) {
				move();
			}
		}
	}
	
	/* karel clears the beepers from a single section*/
	private void clearBeepers() {
		turnLeft();
		move();
		
		while (beepersPresent()) {
			pickBeeper();
		}
		
		turnAround();
		move();
		move();
		
		while (beepersPresent()) {
			pickBeeper();
		}
		
		turnAround();
		move();
		turnRight();
	}
	
}
