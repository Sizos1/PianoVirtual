import java.io.file;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class UNpianovirtual {
    public static void main(String[] args){
        System.out.println("abc");
        nota F1 = new nota();
        F1.setPAR("F1", "key01.mp3");
    }
    class nota{
        String id,path;
        public void nota(){
            id="";
            path=""; 
        }
        public void setPAR(String i, String p){
            id = i;
            path = p;
        }        
        public void sonar(){
            try {
                File sonido = new File (path);
                if(sonido.exists()){
                  AudioInputStream audio= AudioSystem.getAudioInputStream(path);
                  Clip clip = AudioSystem.getClip();
                  clip.open(audio);
                  clip.start(); 
                }
                else{
                    System.out.println("No se encuentra la nota");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
     
}
