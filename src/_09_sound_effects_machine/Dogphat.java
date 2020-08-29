package _09_sound_effects_machine;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Dogphat {
	
	public static void main(String[] args) {

		JFrame frame = new JFrame();
        new Dogphat().showButton();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        
	}
	public void showButton() {
        System.out.println("Button clicked");
   }


    
      
   
	private void playSound(String fileName) {
	      AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	      sound.play();
	}
	
	
	
	
	
}
