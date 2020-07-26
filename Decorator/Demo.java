
package Decorator;

public class Demo {
    public static void main(String[] args) {
    WebPage webpage=new BasicWebPage();
    webpage=new AuthorizedWebPage(webpage);
    webpage=new AuthenticateWebPage(webpage);
    webpage.display();
    }
}
