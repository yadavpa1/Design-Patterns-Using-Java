
package Composite;

public class Leaf implements Employee1{
    private String name;
    private long id;
    private String position;
    
    public Leaf(String name,long id,String position){
        this.name=name;
        this.id=id;
        this.position=position;
    }
    @Override
    public void showEmployeeDetails() {
        System.out.println("Employee name:"+name+"\tEmployee id:"+id);
    }

    @Override
    public void addEmployee(Employee1 e) {
       //do nothing
    }

    @Override
    public void removeEmployee(Employee1 e) {
      //do nothing
    }
    
}
