
package Decorator;

public class AuthenticateWebPage extends WebPageDecorator{
    public AuthenticateWebPage(WebPage webpage){
        super(webpage);
    }
    public void authenticate(){
        System.out.println("Authenticate user");
    }
    public void display(){
        super.display();
        this.authenticate();
    }
}
