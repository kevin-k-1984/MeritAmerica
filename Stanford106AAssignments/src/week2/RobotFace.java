package week2;

import acm.program.*;

public class RobotFace extends GraphicsProgram {
	
	private static final int FACE_WIDTH = 300;
	private static final int FACE_HEIGHT = 400;

	public void run() {
		GFace face = new GFace(FACE_WIDTH, FACE_HEIGHT);
		add(face,
				(getWidth() - FACE_WIDTH) / 2,
				(getHeight() - FACE_HEIGHT) / 2);
	}
}
