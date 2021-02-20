package week2;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawingLines extends GraphicsProgram {
	
	private GLine lineObj;	
	
	public void run() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		lineObj = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(lineObj, e.getX(), e.getY());
	}
	
	public void mouseReleased(MouseEvent e) {
		lineObj = null;
	}
	
	public void mouseDragged(MouseEvent e) {
		if (lineObj != null) {
			lineObj.setEndPoint(e.getX(), e.getY());
		}
	}
}
