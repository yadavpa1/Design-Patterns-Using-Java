
package Adapter;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType)
    {
        if(audioType.equalsIgnoreCase("mp4"))
        {
            advancedMediaPlayer=new Mp4Player();
            //advancedMediaPlayer.playMp4(filename);
        }
        else if(audioType.equalsIgnoreCase("vlc"))
        {
            advancedMediaPlayer=new VLCPlayer();
            // advancedMediaPlayer.playVlc(filename);
        }
    }
public void play(String audioType,String filename)
{
    if(audioType.equalsIgnoreCase("mp4"))
        {
            //advancedMediaPlayer=new Mp4Player();
            advancedMediaPlayer.playMp4(filename);
        }
        else if(audioType.equalsIgnoreCase("vlc"))
        {
            //advancedMediaPlayer=new VLCPlayer();
            advancedMediaPlayer.playVlc(filename);
        }
}
    
    
}
