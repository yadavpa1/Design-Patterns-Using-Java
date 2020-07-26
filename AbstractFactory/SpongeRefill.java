
package AbstractFactory;

public class SpongeRefill implements Refill{
    public Refill createRefill()
    {
        return new SpongeRefill();
    }
     public String toString()
    {
        return "Sponge";
    }
}
