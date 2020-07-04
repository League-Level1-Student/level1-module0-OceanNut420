package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class HousesRunner {

	public static void main(String[] args) {
		//Here we call the run() method from the Houses class
		Houses houseBuilder = new Houses();
		houseBuilder.run();
		Robot cat = new Robot();
		cat.setSpeed(10000);
		cat.setPenWidth(10);
		cat.turn(180);
		cat.move(255);
		cat.turn(90);
		cat.move(400);
		cat.turn(90);
		String hieght = "small";
		Random ree = new Random();
		
		cat.setWindowColor(Color.black);
			for(int i = 0; i < 10; i++) {	
				int mee = ree.nextInt(3);
				if(mee == 0) {
			hieght = "small";
		}
		if(mee == 1) {
			hieght = "medium";
		}
		if(mee == 2) {
			hieght = "large";
		}


		house(cat, hieght, Color.WHITE);
		
	
	}

	}
	static void house(Robot cat, String hieght, Color color) {
		int bucket = 60;
		if(hieght .equals("small")) {
			bucket = 60;
		}
		if(hieght .equals("medium")) {
			bucket = 120;
		}
		if(hieght .equals("large")) {
			bucket = 250;
			cat.setPenColor(color);
			cat.move(10);
			cat.penDown();
			cat.setSpeed(1000);
			cat.move(bucket - 10);
			cat.turn(90);
			cat.move(30);
			cat.turn(90);
			cat.move(bucket);
			cat.turn(-90);
			cat.move(11);
			cat.setPenColor(0,255,0);
			cat.move(13);
			cat.setPenColor(color);
			cat.move(2);
			cat.turn(-90);
			cat.penUp();

		}
		else {
			cat.setPenColor(color);
			cat.move(10);
			cat.penDown();
			cat.setSpeed(1000);
			cat.move(bucket - 10);
			cat.turn(45);
			cat.move(25);
			cat.turn(90);
			cat.move(25);
			cat.turn(45);
			cat.move(bucket);
			cat.turn(-90);
			cat.move(11);
			cat.setPenColor(0,255,0);
			cat.move(13);
			cat.setPenColor(color);
			cat.move(2);
			cat.turn(-90);
			cat.penUp();

				}

	}

	
	
}
