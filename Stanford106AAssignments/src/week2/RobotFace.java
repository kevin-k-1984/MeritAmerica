package week2;

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class RobotFace extends GraphicsProgram {
	
	private static final int HEAD_WIDTH = 200;
	private static final int HEAD_HEIGHT = 300;
	private static final int EYE_RADIUS = 40;
	private static final int MOUTH_WIDTH = 120;
	private static final int MOUTH_HEIGHT = 40;
	
	public void run() {
		
		GPoint center = new GPoint((getWidth() / 2) - (HEAD_WIDTH / 2), (getHeight() / 2) - (HEAD_HEIGHT / 2));
		
		add(MakeFace(), center);
	}
	
	private GCompound MakeFace() {
		GCompound face = new GCompound();
		
		face.add(MakeHead());
		face.add(MakeEye(), (HEAD_WIDTH * 0.25) - (EYE_RADIUS * 0.5), (HEAD_HEIGHT * 0.25) - (EYE_RADIUS * 0.5));
		face.add(MakeEye(), (HEAD_WIDTH * 0.75) - (EYE_RADIUS * 0.5), (HEAD_HEIGHT * 0.25) - (EYE_RADIUS * 0.5));
		face.add(MakeMouth(), (HEAD_WIDTH * 0.5) - (MOUTH_WIDTH * 0.5), (HEAD_HEIGHT * 0.75) - (MOUTH_HEIGHT * 0.5));
		
		return face;
	}

	private GRect MakeMouth() {
		GRect mouth = new GRect(MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.white);
		return mouth;
	}

	private GOval MakeEye() {
		GOval eye = new GOval(EYE_RADIUS, EYE_RADIUS);
		eye.setFilled(true);
		eye.setFillColor(Color.yellow);
		return eye;
	}

	private GRect MakeHead() {
		GRect head = new GRect(HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.gray);
		return head;
	}
}
