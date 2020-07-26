
package Adapter;

public class VLCPlayer implements AdvancedMediaPlayer{
    public void playVlc(String filename)
    {
        System.out.println("Playing vlc file of name:"+filename);
    }
    public void playMp4(String filename)
    {
        //do nothing
    }
}
