package week4;

import java.awt.event.MouseEvent;
import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class MidtermFrogger extends GraphicsProgram {

	private static final int SQUARE_SIZE = 75;
	private static final int NROWS = 4;
	private static final int NCOLUMNS = 7;
	
	private GImage virus;
	private double pos_x;
	private double pos_y;
	
	public static final int APPLICATION_WIDTH = NCOLUMNS * SQUARE_SIZE;
	public static final int APPLICATION_HEIGHT = NROWS * SQUARE_SIZE;
	
	public void init() {
		this.virus = new GImage("virus.jpg");
		this.virus.setSize(75, 75);
		this.pos_x = (double)APPLICATION_WIDTH / 2;
		this.pos_y = ((double)APPLICATION_HEIGHT - (SQUARE_SIZE / 2));
		
		addMouseListeners();
	}
	
	public void run() {
		add(this.virus, this.pos_x - this.virus.getWidth() / 2, this.pos_y - this.virus.getHeight() / 2);
	}
	
	public void mouseClicked(MouseEvent e) {
		double mouse_x = e.getX();
		double mouse_y = e.getY();
		
		if (Math.abs(mouse_x - pos_x) > Math.abs(mouse_y - pos_y)) {
			if (mouse_x > pos_x) {
				if (pos_x + SQUARE_SIZE <= APPLICATION_WIDTH) moveVirus(SQUARE_SIZE, 0);
			} else {
				if (pos_x - SQUARE_SIZE >= 0) moveVirus(-SQUARE_SIZE, 0);
			}
		} else {
			if (mouse_y > pos_y) {
				if (pos_y + SQUARE_SIZE <= APPLICATION_HEIGHT) moveVirus(0, SQUARE_SIZE);
			} else {
				if (pos_y - SQUARE_SIZE >= 0) moveVirus(0, -SQUARE_SIZE);
			}
		}
	}

	private void moveVirus(double x, double y) {
		pos_x += x;
		pos_y += y;
		this.virus.move(x, y);
	}
}
