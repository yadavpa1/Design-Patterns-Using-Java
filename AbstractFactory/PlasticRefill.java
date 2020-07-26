
package AbstractFactory;

public class PlasticRefill implements Refill{
    public Refill createRefill()
    {
        return new PlasticRefill();
    }
    public String toString()
    {
        return "Plastic";
    }
}
