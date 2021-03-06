package week4;
import stanford.karel.*;

public class MidtermKarel extends SuperKarel {
	
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
