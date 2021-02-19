package week2;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawingLines extends GraphicsProgram {

	private GLabel label;
	
	public void run() {
		label = new GLabel("");
		label.setFont("Times New Roman-36");
		add(label, 50, 50);
		
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		println("Hello World");
	}
	
	public void mousePressed(MouseEvent e) {
		
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public void mouseMoved(MouseEvent e) {
		label.setLabel("Mouse: (" + e.getX() + ", " + e.getY() + ")" );
	}
	
	public void mouseDragged(MouseEvent e) {
		
	}
}
