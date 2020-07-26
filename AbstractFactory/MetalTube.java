
package AbstractFactory;

public class MetalTube implements Tube{
    public Tube createTube()
    {
        return new MetalTube();
    }
     public String toString()
    {
        return "Metal";
    }
}
