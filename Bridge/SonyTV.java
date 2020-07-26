
package Bridge;
//concrete bridge implementer interface
public class SonyTV implements TV{
    public void on()
    {
        System.out.println("SonyTV is on");
    }
    public void off()
    {
        System.out.println("SonyTV is off");
    }
    public void tuneChannel()
    {
        System.out.println("SonyTv channel is tuned");
    }
}
