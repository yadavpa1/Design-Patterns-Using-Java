
package Strategy;
public class Demo {
    public static void main(String[] args) {
        Context context=new Context(new AddOperation());
        System.out.println(context.executeStrategy(10, 5));
        context=new Context(new SubOperation());
        System.out.println(context.executeStrategy(10, 5));
    }
    
}
