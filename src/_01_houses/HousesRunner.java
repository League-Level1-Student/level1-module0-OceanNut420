package _01_houses;

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
		
		int hieght = 20;
		
			for(int i = 0; i < 10; i++) {	
		
		house(cat, hieght);
		hieght = hieght + 10;
	
	}

	}
	static void house(Robot cat, int hieght) {
		cat.move(10);
		cat.penDown();
		cat.setSpeed(1000);
		cat.move(hieght - 10);
		cat.turn(90);
		cat.move(30);
		cat.turn(90);
		cat.move(hieght);
		cat.turn(-90);
		cat.move(11);
		cat.setPenColor(0,255,0);
		cat.move(13);
		cat.setPenColor(0,0,0);
		cat.move(2);
		cat.turn(-90);
		cat.penUp();
		

	}

	
	
}
