
package Observer;
public class Demo {
    public static void main(String[] args) {
       Subject subject=new Subject();
       new BinaryObserver(subject);
       new OctalObserver(subject);
       
        System.out.println("Subject state change to 15");
        subject.setState(15);
        System.out.println("Subject state now change to 10");
        subject.setState(10);
    }
}
