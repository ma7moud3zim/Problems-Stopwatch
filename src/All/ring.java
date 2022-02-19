
package All;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ring {
  
        
        public static File file = new File("ring.wav");
        AudioInputStream Ring = AudioSystem.getAudioInputStream(file);  
        Clip ringing = AudioSystem.getClip();
        boolean s = false;
        public ring() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
              ringing.open(this.Ring);
        }
    
        public void Start() throws LineUnavailableException, IOException{
            if(s){
            ringing.setMicrosecondPosition(0);
            ringing.start();
            return;  
            }
            
            ringing.start();
            s = !s;
        }
         
            
}
