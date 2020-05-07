/* 
 * Sprite.java
 * last modification date: 07.05.2020
 * by Mateus Novaes
 * 
 * */

package main;

/* === Imports === */

import java.awt.Image;
import javax.swing.ImageIcon;

/* === This Sprite Class share common aspects and code from the Missile and SpaceShip classes === */

public class Sprite {
	
	// Super Class Sprite protected methods 
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected boolean visible;
	protected Image image; 
	
	// Constructor method
	public Sprite(int x, int y) {
		
		this.x 	= x;
		this.y 	= y;
		visible = true;
	}
	
	/* === Some methods === */
	
	protected void loadImage(String imageName) {
		
		ImageIcon ii = new ImageIcon(imageName);
		image 		 = ii.getImage();
	}
	
	protected void getImageDimensions() {
		
		width  = image.getWidth(null);
		height = image.getHeight(null);
	}
	
	/* === Getters and Setters === */
	
	public Image getImage() {
		
		return image;
	}
	
	public int getX() {
		
		return x;
	}
	
	public int getY() {
		
		return y;
	}
	
	public boolean isVisible() {
		return visible;
	}
	
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
