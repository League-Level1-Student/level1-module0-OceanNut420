package _07_fortune_cookie;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		new FortuneCookie().showButton();
	    JButton button = new JButton();
	    frame.add(button);
	    frame.pack();
	    

	}

    public void showButton() {
        System.out.println("Button clicked");
   }

}
