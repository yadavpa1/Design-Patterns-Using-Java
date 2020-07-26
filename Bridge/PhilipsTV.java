
package Bridge;
//concrete bridge implementer interface
public class PhilipsTV implements TV{
    public void on()
    {
        System.out.println("PhilipsTV is on");
    }
    public void off()
    {
        System.out.println("PhilipsTV is off");
    }
    public void tuneChannel()
    {
        System.out.println("PhilipsTV channel is tuned");
    }
}
