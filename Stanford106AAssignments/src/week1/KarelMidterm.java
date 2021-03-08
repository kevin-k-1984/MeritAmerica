package week1;
import stanford.karel.*;

public class KarelMidterm extends SuperKarel {
	
	public void run() {
		move();
		turnLeft();
		move();
		turnRight();
		
		while(frontIsClear()) {
			if (!beepersInBag()) setBeepersInBag(1);
			if (noBeepersPresent()) putBeeper();
			move();
		}
		
		turnAround();
		move();
		turnRight();
		move();
		
		while(frontIsClear()) {
			if (!beepersInBag()) setBeepersInBag(1);
			if (noBeepersPresent()) putBeeper();
			move();
		}
		
		turnAround();
		move();
		turnRight();
		move();
		
		while(frontIsClear()) {
			if (!beepersInBag()) setBeepersInBag(1);
			if (noBeepersPresent()) putBeeper();
			move();
		}
		
		turnAround();
		move();
		turnRight();
		move();
		
		while(frontIsClear()) {
			if (!beepersInBag()) setBeepersInBag(1);
			if (noBeepersPresent()) putBeeper();
			move();
		}
	}

}
