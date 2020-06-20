package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class HousesRunner {

	public static void main(String[] args) {
		//Here we call the run() method from the Houses class
		Houses houseBuilder = new Houses();
		houseBuilder.run();
		Robot cat = new Robot();
		cat.setSpeed(1000);
		cat.move(-250);
		cat.turn(90);
		cat.move(-400);
		cat.turn(-90);
		cat.setPenWidth(10);
		cat.penDown();
	for(int i = 0; i < 10; i++) {	
		house(cat);
	}

	}
	static void house(Robot cat) {
		cat.move(10);
		cat.penDown();
		cat.setSpeed(1000);
		cat.move(90);
		cat.turn(90);
		cat.move(30);
		cat.turn(90);
		cat.move(100);
		cat.turn(-90);
		cat.setPenColor(0,255,0);
		cat.move(20);
		cat.turn(-90);
		cat.setPenColor(0,0,0);
		cat.penUp();

	}

	
	
}
