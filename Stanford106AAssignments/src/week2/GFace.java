package week2;

import java.awt.Color;
import acm.graphics.*;

public class GFace extends GCompound {
	
	private static final double EYE_WIDTH = 0.15;
	private static final double EYE_HEIGHT = 0.15;
	private static final double MOUTH_WIDTH = 0.50;
	private static final double MOUTH_HEIGHT = 0.03;
	
	private GRect head;
	private GOval rightEye, leftEye;
	private GRect mouth;
	
	public GFace(double width, double height) {
		head = new GRect(width, height);
		leftEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		rightEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		mouth = new GRect(MOUTH_WIDTH * width, MOUTH_HEIGHT * height);
		
		head.setFillColor(Color.gray);
		head.setFilled(true);
		
		add(head, 0, 0);
	}
}

