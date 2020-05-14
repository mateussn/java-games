package main;

public class Missile extends Sprite {

	// Constants
	private final int BOARD_WIDTH = 390;
	private final int MISSILE_SPEED = 2;
	
	public Missile(int x, int y) {
		
		super(x, y); // Sending position attributes to superclass
		initMissile();
	}
	
	private void initMissile() {
		
		/* Calling superclass methods */ 
		
		loadImage("src/resources/missile.png");
		getImageDimensions(); 
	}
	
	public void move() {
		
		// Incrementing the speed
		x += MISSILE_SPEED;
		
		// If Missile cross the screen
		if(x > BOARD_WIDTH)
			visible = false;
		
	}
}
