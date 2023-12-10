package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 100;
    int y = 300;
    int birdYVelocity = -15;
    int gravity = 1;
    int upperPipeHeight;
    int Xchange;
    int score = 0;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        frameRate(60);
        Xchange = WIDTH;
        upperPipeHeight = (int) random(100, 400);
    }

    @Override
    public void draw() {
        background(194, 218, 184);
        fill(255, 255, 0);
        ellipse(x, y, 25, 25);
        y += gravity;
        fill(50, 255, 0);
        rect(Xchange, 0, 50, upperPipeHeight);
        fill(50, 255, 0);
        rect(Xchange, upperPipeHeight + 150, 50, HEIGHT - (upperPipeHeight + 150));
        Xchange -= 2;
        text("score is " + score, 350, 100);

        if (intersectsPipes()) {
            x = 100;
            y = 300;
            Xchange = WIDTH;
            upperPipeHeight = (int) random(100, 400);
        }
        if (touchGround()) {
    		x = 100;
    		y = 300;
    		Xchange = WIDTH;
    		upperPipeHeight = (int) random(100, 400);
    	}
        
        if (passPipes()) {
    		x = 100;
    		y = 300;
    		Xchange = WIDTH;
    		upperPipeHeight = (int) random(100, 400);
    		score+=1;
    	}
    }

    boolean intersectsPipes() {
        if ((y < upperPipeHeight || y > upperPipeHeight + 150) && x > Xchange && x < (Xchange + 50)) {
            return true;
        } else {
            return false;
        }
    }
    
	boolean touchGround() {
		if (y>0) {
			return false;
		} else {
			return true;
		}
	}
	
	boolean passPipes() {
		if (Xchange<0) {
			return true;
		} else {
			return false;
		}
	}

    public void mousePressed() {
        if (y > 0) {
            y += birdYVelocity;
        }
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
