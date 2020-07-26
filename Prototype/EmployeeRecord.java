
package Prototype;

public class EmployeeRecord extends Prototype{
    private String id;
    private String name;
    private String addr;
    private String salary;
    private String designation;
    
    public EmployeeRecord(){}
    public EmployeeRecord(String id,String name,String addr,String salary, String designation)   
    {
        this.id=id;
        this.name=name;
        this.addr=addr;
        this.salary=salary;
        this.designation=designation;
    }
    public void showRecord()
    {
        System.out.println("Id:"+id+"Name:"+name+"addr:"+addr);
    }
}
