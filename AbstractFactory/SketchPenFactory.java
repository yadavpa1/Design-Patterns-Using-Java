
package AbstractFactory;

public class SketchPenFactory implements AbstractFactory{
    private Refill r;
    private Tube t;
    
    public Tube getTube()
    {
      return new FiberTube();  
    }
    public Refill getRefill()
    {
        return new SpongeRefill();
    }
    public void create()
    {
        r=getRefill();
        t=getTube();
        System.out.println("SketchPen with "+r+"refill and\t"+t+"tube");
    }
}
