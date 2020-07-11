package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// Copy Image Address)
		String sticc = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fdictionary.cambridge.org%2Fimages%2Fthumb%2Fstick_noun_002_35886.jpg%3Fversion%3D5.0.102&imgrefurl=https%3A%2F%2Fdictionary.cambridge.org%2Fdictionary%2Fenglish%2Fstick&tbnid=cOGJ5Ke2CQlWuM&vet=12ahUKEwjf8tm29sPqAhViN30KHaKIDPcQMygBegUIARDwAQ..i&docid=9S0BnbFxWmYepM&w=200&h=138&q=stick&safe=strict&ved=2ahUKEwjf8tm29sPqAhViN30KHaKIDPcQMygBegUIARDwAQ";
		// 2. create a variable of type "Component" that will hold your image
		Component stick;
		// 3. use the "createImage()" method below to initialize your Component
		stick = createImage(sticc);
		// 4. add the image to the quiz window
		//quizWindow.add(stick);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String cat = JOptionPane.showInputDialog("is sticc over 1 atom long?");
		// 7. print "CORRECT" if the user gave the right answer
		if(cat.contentEquals("yes")) {
		System.out.println("correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else{
			System.out.println("incorrect");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		//ok
		// 10. find another image and create it (might take more than one line
		// of code)
		String B = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fdlpng.com%2Fpng%2F6817837&psig=AOvVaw1s1uzmTWB5ev_ajwyOYvYu&ust=1594514961989000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCr8KL9w-oCFQAAAAAdAAAAABAD";
		// 11. add the second image to the quiz window
		Component bb;
		bb = createImage(B);
		quizWindow.add(bb);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String e = JOptionPane.showInputDialog("is this letter A?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(e.equals("no")) {
			System.out.println("correct");
		}
			else {
				System.out.println("incorrect");
			}
		}
	

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
