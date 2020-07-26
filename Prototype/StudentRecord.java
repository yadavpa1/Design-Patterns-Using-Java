
package Prototype;

public class StudentRecord extends Prototype{
    private String roll;
    private String cgpa;
    public StudentRecord(){}
    public StudentRecord(String roll,String cgpa)
    {
        this.roll=roll;
        this.cgpa=cgpa;
    }
    public void showRecord()
    {
        System.out.println("Roll:"+roll+"Cgpa:"+cgpa);
    }
    
}
