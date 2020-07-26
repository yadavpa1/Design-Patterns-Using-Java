
package State;

public class TVRemote {
    public static void main(String[] args) {
        TvContext tv=new TvContext();
        State start=new TvStartState();
        State stop=new TvStopState();
        tv.setState(start);
        tv.doAction();
        tv.setState(stop);
        tv.doAction();
    }
}
