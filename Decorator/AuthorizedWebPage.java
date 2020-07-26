
package Decorator;

public class AuthorizedWebPage extends WebPageDecorator{
    public AuthorizedWebPage(WebPage webpage){
        super(webpage);
    }
    public void authorize(){
        System.out.println("Authorized user");
    }
    public void display(){
        super.display();
        this.authorize();
    }
}
