package _11_spinning_record;

public class meltedbanana {

	public static void main(String[] args) {
	
	}
	
	public void setup() {
		PImage pictureOfRecord;                        //as member variable
		size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method

	}
	
	public void draw() {
		image(pictureOfRecord, xPosition, yPosition);  //in draw method
	}

}
