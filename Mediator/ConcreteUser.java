
package Mediator;

public class ConcreteUser extends User{
    public ConcreteUser(ChatMediator med,String u){
        super(med,u);
    }
    public void sendMessage(String msg){
        System.out.println(username+" sending msg "+msg);
        mediator.sendMessage(this, msg);
    }
    public void recieveMessage(String msg){
        System.out.println(username+" recieved msg "+msg);
    }
}
