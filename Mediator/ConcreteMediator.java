
package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements ChatMediator{
    private List<User> users;
    public ConcreteMediator(){
        this.users=new ArrayList<>();
    }
    public void sendMessage(User user,String msg){
        for(User u:users){
            if(u!=user)
                u.recieveMessage(msg);
        }
    }
    public void addUser(User user){
        users.add(user);
    }
}
