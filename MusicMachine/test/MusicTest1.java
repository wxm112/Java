/**
 * Created by mayw on 13/10/2015.
 */
import javax.sound.midi.*;

class MusicTest1 {

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a sequencer");
        } catch(MidiUnavailableException ex) {
            System.out.println("Bummer");
        }

    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
