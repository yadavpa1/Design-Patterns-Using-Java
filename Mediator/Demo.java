
package Mediator;

public class Demo {
    public static void main(String[] args) {
         ChatMediator chatMediator=new ConcreteMediator();
         User user1=new ConcreteUser(chatMediator,"Pooja");
         User user2=new ConcreteUser(chatMediator,"Lisa");
         User user3=new ConcreteUser(chatMediator,"Ray");
         User user4=new ConcreteUser(chatMediator,"Anuradha");
         chatMediator.addUser(user1);
         chatMediator.addUser(user2);
         chatMediator.addUser(user3);
         chatMediator.addUser(user4);
         user1.sendMessage("Hi All");
    }

}
