
package AbstractFactory;

public class FiberTube implements Tube{
    public Tube createTube()
    {
        return new FiberTube();
    }
     public String toString()
    {
        return "Fiber";
    }
}
