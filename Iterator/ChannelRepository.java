
package Iterator;

public class ChannelRepository implements Container{
    String[] channels={"Colors","Sony","Starplus","Discovery"};
    public Iterator getIterator(){
        return new ChannelIterator();
    }
    private class ChannelIterator implements Iterator{
        int index;
        public boolean hasNext(){
            if(index<channels.length)
                return true;
            else
                return false;
        }
        
        public Object next(){
            if(this.hasNext()){
                return channels[index++];
            }
            else
                return  null;
        }
    }
}
