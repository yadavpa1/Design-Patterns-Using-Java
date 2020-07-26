
package Prototype;

public class Demo {
    public static void main(String[] args) {
       Prototype p=new EmployeeRecord("1","Pooja","Nagpur","1000","Engineer");
       p.showRecord();
        System.out.println("");
        
        EmployeeRecord e2= (EmployeeRecord)p.clone();
        e2.showRecord();
        System.out.println("");
        
        Prototype p2= new StudentRecord("15","9.9");
        p2.showRecord();
        System.out.println("");
        StudentRecord s2=(StudentRecord)p2.clone();
        s2.showRecord();
           
    }
}
