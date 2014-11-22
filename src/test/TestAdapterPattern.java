package test;

import adapterpattern.AudioPlayer;

/**
 * @author tombisni@yahoo.com
 */
public class TestAdapterPattern {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "Sakit Hati.mp3");
        audioPlayer.play("mp4", "Kecewa.mp4");
        audioPlayer.play("vlc", "Bangkit Kembali.vlc");
        audioPlayer.play("avi", "Semangat.avi");
    }
}