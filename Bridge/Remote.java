

package Bridge;

public abstract class Remote {
    TV tv;
    public Remote(TV tv){
        this.tv=tv;
    }
    public abstract void on();
    public abstract void off();
    public abstract void  tuneChannel();
}
