
package TemplateMethod;

public class Demo {
    public static void main(String[] args) {
        HouseTemplate houseType=new WoodenHouse();
        houseType.buildHouse(); //using the template method
        
        houseType=new GlassHouse();
        houseType.buildHouse();
        
    }
    
}
