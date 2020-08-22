package _09_sound_effects_machine;

import javax.swing.JApplet;

public class Dogphat {

	public static void main(String[] args) {
		

	}
	public void showButton() {
        System.out.println("Button clicked");
   }
	public class FortuneCookieRunner {
      
            new FortuneCookie().showButton();
      }
   
	private void playSound(String fileName) {
	      AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	      sound.play();
	}
	
	
	
	
	
}
