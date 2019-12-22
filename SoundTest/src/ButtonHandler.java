import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JTextArea;


public class ButtonHandler implements ActionListener {

	private Clip clip;
	
		//initialize audio sound
	public ButtonHandler(String soundFileName) {
	

		//What happens ones you start the program
		try {
			File file = new File(soundFileName);
			AudioInputStream sound = AudioSystem.getAudioInputStream(file);//creating file object that  brings music to java program 
			clip = AudioSystem.getClip();
			clip.open(sound);
			clip.stop();
		} catch (Exception e) {
			
		}
		
	}
	

	//what happens ones you press button
	@Override
	public void actionPerformed(ActionEvent e) {
		clip.setFramePosition(0);
		clip.start(); 
		
		
		
	}
	

}

