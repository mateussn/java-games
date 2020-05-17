package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

	private final int ICRAFT_X = 40;
	private final int ICRAFT_Y = 60;
	private final int DELAY    = 10;
	private Timer timer;
	private SpaceShip spaceShip;
	
	public Board() {
		
		initBoard();
	}
	
	private void initBoard() {
		
		addKeyListener(new TAdapter());
		setBackground(Color.BLACK);
		setFocusable(true);
		
		spaceShip = new SpaceShip(ICRAFT_X, ICRAFT_Y);
		
		timer = new Timer(DELAY,this);
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		doDrawing(g);
	}
	
	private void doDrawing(Graphics g) {
		
		// Paused here...
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
