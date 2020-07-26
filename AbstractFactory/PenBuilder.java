
package AbstractFactory;

public class PenBuilder {
    private AbstractFactory factory;
    public PenBuilder(AbstractFactory factory)
    {
        this.factory=factory;
    }
    
    public void orderPen()
    {
       factory.create();
      
    }
   
}
