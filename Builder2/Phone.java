
package Builder2;

public class Phone {
    private String os;
    private int ram;
    private int screensize;
    
    public Phone(Builderxx b)
    {
       this.os= b.os;
       this.ram=b.ram;
       this.screensize=b.screensize;
        
    }
    public String toString()
    {
        return "Operating System:"+os+"\tRAM:"+ram+"\tScreensize:"+screensize;
    }   
   
}

