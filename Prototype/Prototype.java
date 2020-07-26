
package Prototype;

public abstract class Prototype implements Cloneable{
    abstract void showRecord();
    @Override
    public Object clone(){
        Object clone=null;
        try{
            clone=super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
    
}
