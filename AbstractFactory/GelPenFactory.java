
package AbstractFactory;

public class GelPenFactory implements AbstractFactory{
    private Refill r;
    private Tube t;
    
    public Tube getTube()
    {
      return new MetalTube();  
    }
    public Refill getRefill()
    {
        return new PlasticRefill();
    }
    public void create()
    {
        r=getRefill();
        t=getTube();
        System.out.println("GelPen with "+r+"refill and\t"+t+"tube");
    }
}
