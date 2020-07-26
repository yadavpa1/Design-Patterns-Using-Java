
package Adapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    public void play(String audioType,String filename)
    {
        if(audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println("Playing"+audioType+"file");
        }
        else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("vlc"))
        {
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }
        else
            System.out.println("Invalid media");
    }
}
