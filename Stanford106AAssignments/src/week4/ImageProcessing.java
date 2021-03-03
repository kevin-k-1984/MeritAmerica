package week4;

import java.awt.event.*;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {
	
	GImage image;
	
	public void init() {
		addKeyListeners();
	}
	
	public void run() {
		this.image = new GImage("beach.jpg");
		this.image.setSize(500, 400);
		
		add(this.image);
		add(new GLabel("Press Enter to flip horizontally"), this.image.getWidth() + 20.0, this.image.getHeight() / 2.0);	
	}
	
	public GImage flipHorizontal(GImage image) {
		int[][] flippedImage = image.getPixelArray();
		int width = flippedImage[0].length;
		int height = flippedImage.length;
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width / 2; j++) {
				int x = width - j - 1;
				int temp = flippedImage[i][j];
				flippedImage[i][j] = flippedImage[i][x];
				flippedImage[i][x] = temp;
			}
		}
		GImage newImage = new GImage(flippedImage);
		newImage.setSize(500, 400);
		return newImage;
	}
	
	public void keyTyped(KeyEvent e) {
		this.image = this.flipHorizontal(this.image);
		add(this.image);
	}
}
