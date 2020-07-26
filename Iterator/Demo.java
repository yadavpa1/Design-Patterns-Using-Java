
package Iterator;

public class Demo {
    public static void main(String[] args) {
        ChannelRepository c=new ChannelRepository();
        for(Iterator iter=c.getIterator();iter.hasNext();){
        String channel=(String)iter.next();
            System.out.println("Channel: "+channel);
    }
    }
 
}
