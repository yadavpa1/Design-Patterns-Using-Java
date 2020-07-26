
package AbstractFactory;

public class Demo {
    public static void main(String[] args) {
       AbstractFactory a;
       PenBuilder p=new PenBuilder(new GelPenFactory());
       p.orderPen();
       
       a=new SketchPenFactory();
       p=new PenBuilder(a);
       p.orderPen();
       
    }
}
