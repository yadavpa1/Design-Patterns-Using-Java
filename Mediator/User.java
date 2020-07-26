
package Mediator;
public abstract class User {
    protected ChatMediator mediator;
    protected String username;
    
    public User(ChatMediator mediator,String username){
        this.mediator=mediator;
        this.username=username;
    }
    public abstract void sendMessage(String msg);
    public abstract void recieveMessage(String msg);
}
