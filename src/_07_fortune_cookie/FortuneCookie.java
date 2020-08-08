package _07_fortune_cookie;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	static JButton button = new JButton();

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		new FortuneCookie().showButton();
		frame.setVisible(true);
		button.setText("fortune");
		frame.add(button);
	    frame.pack();
	    
	    

	}

    public void showButton() {
        button.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Button clicked");
		JOptionPane.showMessageDialog(null, "woohoo");
		int rand = new Random().nextInt(5);
		
		if(rand == 1) {
			JOptionPane.showMessageDialog(null, "you will eat sand in the next year");
		}
		
		if(rand == 2) {
			JOptionPane.showMessageDialog(null, "you will become a 2013 McDonalds hamburger in the next week");
		}

		if(rand == 3) {
			JOptionPane.showMessageDialog(null, "you will become famous for breathing");
		}

		if(rand == 4) {
			JOptionPane.showMessageDialog(null, "you will drink water on christmas");
		}

		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "you wont eat a motherboard in the next 48 hours");
		}

	}

}
