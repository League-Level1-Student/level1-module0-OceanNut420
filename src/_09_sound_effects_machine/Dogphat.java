package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dogphat implements ActionListener {
	static JButton button = new JButton();
	static JButton buttoff = new JButton();
	static JButton but = new JButton();
	public static void main(String[] args) {

		JFrame frame = new JFrame();
        new Dogphat().showButton();
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(100,100));
        button.setText("z");
        buttoff.setText("zz");
        but.setText("zzz");
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.add(button);
        panel.add(buttoff);
        panel.add(but);
        frame.pack();
	}
	
	public void showButton() {
                button.addActionListener(this);
                buttoff.addActionListener(this);
                but.addActionListener(this);
   }
	


    
      
   
	private void playSound(String fileName) {
	      AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	      sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Button clicked");
		JButton buttonClicked = (JButton) e.getSource();
		if(buttonClicked == button) {
			playSound("breathe.html");
		}
	}
	
	
	
	
	
}
