package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 100;
    int y = 300;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
    	background(194,218,184);
    	fill(255,255,0);
    	stroke(194,218,184);
    	ellipse(x, y, 25, 25);
    	y-=2;	
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
