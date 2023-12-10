package _01_methods._1_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
	Robot rob = new Robot();
	rob.setX(50);
	rob.setY(300);
	rob.setSpeed(999999);
	rob.hide();
	String color = JOptionPane.showInputDialog("What color do you want it");
	String size1 = JOptionPane.showInputDialog("What size do you want it");
	String which1 = JOptionPane.showInputDialog("Which do you want it, pointy or flat");
	for (int i = 1; i < 11; i++) {
		building(color,rob,size1,which1);
	}
	}

static void building(String color1, Robot rob, String size, String which) {
	if (color1.equals("red")) {
		rob.setPenColor(255,0,0);
	}
	if (color1.equals("blue")) {
		rob.setPenColor(0,0,255);
	}
	if (color1.equals("green")) {
		rob.setPenColor(0,255,0);
	}
	if (size.equals("small") && which.equals("flat")) {
		rob.penDown();
		rob.move(60);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(60);
		rob.turn(-90);
		rob.setPenColor(130,200,130);
		rob.move(30);
		rob.turn(-90);
	}
	else if (size.equals("medium") && which.equals("flat")) {
		rob.penDown();
		rob.move(120);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(120);
		rob.turn(-90);
		rob.setPenColor(130,200,130);
		rob.move(30);
		rob.turn(-90);
	}
	else if (size.equals("large") && which.equals("flat")) {
		rob.penDown();
		rob.move(250);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(250);
		rob.turn(-90);
		rob.setPenColor(130,200,130);
		rob.move(30);
		rob.turn(-90);
	}
	else if (size.equals("small") && which.equals("pointy")) {
		rob.penDown();
		rob.move(60);
		rob.turn(45);
		rob.move(20);
		rob.turn(90);
		rob.move(20);
		rob.turn(45);
		rob.move(60);
		rob.turn(-90);
		rob.setPenColor(130,200,130);
		rob.move(30);
		rob.turn(-90);
	}
	else if (size.equals("medium") && which.equals("pointy")) {
		rob.penDown();
		rob.move(120);
		rob.turn(45);
		rob.move(20);
		rob.turn(90);
		rob.move(20);
		rob.turn(45);
		rob.move(120);
		rob.turn(-90);
		rob.setPenColor(130,200,130);
		rob.move(30);
		rob.turn(-90);
	}
	else if (size.equals("large") && which.equals("pointy")) {
		rob.penDown();
		rob.move(250);
		rob.turn(45);
		rob.move(20);
		rob.turn(90);
		rob.move(20);
		rob.turn(45);
		rob.move(250);
		rob.turn(-90);
		rob.setPenColor(130,200,130);
		rob.move(30);
		rob.turn(90);
	}
	
	}

}

		// Check the recipe to find out what code to put here
