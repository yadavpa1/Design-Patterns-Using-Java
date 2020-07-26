
package Decorator;

public class BasicWebPage implements WebPage{
    private String html="a";
    private String stylesheets="b";
    public void display(){
        System.out.println("Basic webpage");
    }
}
