
package Singleton;

public class Demo {
    public static void main(String[] args) {
        Singleton s= Singleton.getInstance();
        System.out.println(s);
        Singleton t=Singleton.getInstance();
        System.out.println(t);
    }
 
    
}
