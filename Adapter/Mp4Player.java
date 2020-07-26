
package Adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    public void playVlc(String filename)
    {
        //do nothing
    }
    public void playMp4(String filename)
    {
       System.out.println("Playing mp4 file with name:"+filename);
    }
}
