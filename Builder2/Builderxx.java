
package Builder2;

public class Builderxx {
          String os;
          int ram;
          int screensize;
        public Builderxx(){}
        public  Builderxx(String os)
        {
            this.os=os;
        }
        public Builderxx(int ram)
        {
            this.ram=ram;
        }
        public Builderxx(String os,int screensize)
        {   this.os=os;
            this.screensize=screensize;
        }
        public Builderxx setOS(String os)
        {
            this.os=os;
            return this;
        }
        public Builderxx setRam(int ram)
        {
            this.ram=ram;
            return this;
            
        }
        public Builderxx setScreensize(int screensize)
        {
            this.screensize=screensize;
            return this;
        }
        public Phone build()
        {
            return new Phone(this);
        }
    }

