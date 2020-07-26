
package Composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
    Employee e[]=new Employee[7];
    e[0]=new Employee("CEO",1,10000);
    e[1]=new Employee("Sales Manager",2,9000);
    e[2]=new Employee("Production Manager",3,9000);
    e[3]=new Employee("Marketing Person1",4,8000);
    e[4]=new Employee("Marketing Person2",5,8000);
    e[5]=new Employee("Clerk1",6,7000);
    e[6]=new Employee("Clerk2",7,7000);
    e[0].add(e[1]);
    e[0].add(e[2]);
    e[1].add(e[3]);
    e[2].add(e[5]);
    e[3].add(e[4]);
    e[5].add(e[6]);
    Employee.show(e);      
     }
}

