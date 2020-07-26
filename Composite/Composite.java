
package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee1 {
    private List<Employee1> subordinates=new ArrayList<>();
    public void showEmployeeDetails()
    {
        for(Employee1 e:subordinates)
            e.showEmployeeDetails();
    }
    
    public void addEmployee(Employee1 e){
        subordinates.add(e);
    }
    
    public void removeEmployee(Employee1 e){
        subordinates.remove(e);
    }

   
}
