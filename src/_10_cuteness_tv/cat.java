package _10_cuteness_tv;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import _09_sound_effects_machine.Dogphat;

public class cat implements ActionListener {

	
		static JButton button = new JButton();
		static JButton buttoff = new JButton();
		static JButton but = new JButton();
		public static void main(String[] args) {

			JFrame frame = new JFrame();
	        frame.setVisible(true);
	        frame.setPreferredSize(new Dimension(100,100));
	        button.setText("z");
	        buttoff.setText("zz");
	        but.setText("zzz");
	        JPanel panel = new JPanel();
	        panel.add(button);
	        panel.add(buttoff);
	        panel.add(but);
	        Dogphat dog = new Dogphat();
	        dog.showButton();
	        frame.add(panel);
	        frame.pack();
	        
	        
		}
		
		public void showButton() {
	                button.addActionListener(this);
	                buttoff.addActionListener(this);
	                but.addActionListener(this);
	                
	   }
		

		void showDucks() {
		      playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		 }

		void showFrog() {
		      playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		 }

		void showFluffyUnicorns() {
		      playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		 }

		void playVideo(String videoID) {
		     
		     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
		     //work on some Linux implementations 
		      try {
		      if (System.getProperty("os.name").toLowerCase().contains("linux")) {
		      if (Runtime.getRuntime().exec(new String[] { 
		       "which", "xdg- open" }).getInputStream().read() != -1) {
		      Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
		      }
		      } else {
		           URI uri = new URI(videoID);
		           java.awt.Desktop.getDesktop().browse(uri);
		      }      } catch (Exception e) {
		           e.printStackTrace();
		      }
		}
	    
	      
	   
		private void playSound(String fileName) {
		      AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
		      sound.play();
		}

		public void actionPerformed(ActionEvent e) {
			System.out.println("Button clicked");
			JButton buttonClicked = (JButton) e.getSource();
			if(buttonClicked == button) {
				System.out.println("button clicked");
				showDucks();
				playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
			}
			if(buttonClicked == buttoff) {
				System.out.println("button clicked");
				showFrog();
				playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
			}

			if(buttonClicked == but) {
				System.out.println("button clicked");
				showFluffyUnicorns();
				playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
			}
		
	}
		}



