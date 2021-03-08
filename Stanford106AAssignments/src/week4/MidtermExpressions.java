package week4;
import acm.program.*;

public class MidtermExpressions extends ConsoleProgram {
	
	public void run() {
		println(5.0 / 4 - 4 / 5);
		println(7 < 9 - 5 && 3 % 0 == 3);
		println("B" + 8 + 4 + "\n");
		
		int num1 = 2;
		int num2 = 13;
		println("The first number is: " + Mystery(num1, 6));
		println("The second number is: " + Mystery(num2 % 5, 1 + num1 * 2));
	}

	private int Mystery(int num1, int num2) {
		num1 = Unknown(num1, num2);
		num2 = Unknown(num2, num1);
			
		return (num2);
	}

	private int Unknown(int num1, int num2) {
		int num3 = num1 + num2;
		num2 += num3 * 2;
		return (num2);
	}

}
