
package Observer;

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }
  
    public void update(){
        System.out.println("Octal string "+Integer.toOctalString(subject.getState()));
    }
}
