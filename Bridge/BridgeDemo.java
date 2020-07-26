
package Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Remote sonyRemote=new ConcreteRemote(new SonyTV());
        Remote philipsRemote=new ConcreteRemote(new PhilipsTV());
        sonyRemote.on();
        sonyRemote.tuneChannel();
        sonyRemote.off();
        philipsRemote.on();
        philipsRemote.tuneChannel();
        philipsRemote.off();
    }
}
