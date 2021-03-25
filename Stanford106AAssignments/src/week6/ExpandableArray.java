package week6;

import java.util.Arrays;

import acm.program.ConsoleProgram;

public class ExpandableArray extends ConsoleProgram {
	
	/**
	 * Object array that will be overwritten when expansion is needed.
	 */
	private Object[] array;
	
	/**
	 * run is used by the main method after configuring the program
	 * as a ConsoleProgram
	 */
	public void run() {

		this.set(5, "New Item");
		String temp = (String) this.get(5);
		String tempBad = (String) this.get(10);
		println(temp);
		println(tempBad);
		
	}
	
	/**
	 * Creates a new expandable array with no elements.
	 */
	public ExpandableArray() {
		this.array = new Object[0];
	}
	
	/**
	 * Sets the element at the given index position to the specified
	 * value. If the internal array is not large enough to contain that
	 * element, the implementation expands the array to make room.
	 */
	public void set(int index, Object value) {
		if (this.array.length >= index + 1) {
			this.array[index] = value;
		} else {
			this.array = Arrays.copyOf(this.array, index + 1);
			this.array[index] = value;
		}
	}
	
	/**
	 * Returns the element at the specified index position, or null if
	 * no such elements exists. Note that this method never throws an
	 * out-of-bounds exception; if the index is outside the bounds of
	 * the array, the return value is simply null.
	 */
	public Object get(int index) {
		if (this.array.length >= index + 1) {
			return this.array[index];
		} else {
			return null;
		}
	}
	
}
