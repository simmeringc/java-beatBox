/**
 * Created by Conner on 9/13/16.
 */

import javax.sound.midi.*;


public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a sequencer");
        } catch(MidiUnavailableException ex) {
            System.out.println("Bummer " + ex);
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}

