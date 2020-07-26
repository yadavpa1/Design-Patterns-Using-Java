
package Bridge;

public class ConcreteRemote extends Remote{
    public ConcreteRemote(TV tv){
        super(tv);
    }
    public void on(){
        tv.on();
    }
    public void off(){
        tv.off();
    }
    public void tuneChannel(){
        tv.tuneChannel();
    }
}
