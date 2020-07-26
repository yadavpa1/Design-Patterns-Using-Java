
package Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
   private String name;
   private int id;
   private int salary;
   private List<Employee> subordinates;
  
   public Employee(String name,int id,int salary)
   {
       this.id=id;
       this.name=name;
       this.salary=salary;
       subordinates= new ArrayList<Employee>();
   }
   
   public void add(Employee e)
   {
       subordinates.add(e);
   }
   public void remove(Employee e)
   {
       subordinates.remove(e);
   }
   public String toString()
   {
       return "Name:"+name+"\tId:"+id+"\tSalary:"+salary;
   }
   
  public List<Employee> getSubordinates()
  {
      return subordinates;
  }
   public static void show(Employee[] ex)
   {
       System.out.println(ex[0]);
     for(Employee employee:ex[0].getSubordinates())
     {    System.out.println(employee);
          for(Employee subemployee:employee.getSubordinates())
            System.out.println(subemployee);
     }
   }
}
