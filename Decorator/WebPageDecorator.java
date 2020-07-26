
package Decorator;

public abstract class WebPageDecorator implements WebPage{
    protected WebPage webpage;
    public WebPageDecorator(WebPage webpage){
        this.webpage=webpage;
    }
    public void display(){
        this.webpage.display();
    }
}
