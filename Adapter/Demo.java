
package Adapter;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp4","Sky full of stars");
        audioPlayer.play("vlc", "Cheap Thrills");
        audioPlayer.play("mp3","Twinkle Twinkle");
        audioPlayer.play("avi", "Osho");
    }
}
