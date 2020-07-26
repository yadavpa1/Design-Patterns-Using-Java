
package TemplateMethod;

public class GlassHouse extends HouseTemplate{
    public void buildPillars(){
        System.out.println("Building pillars with glass coating");
    }
    public void buildWalls(){
        System.out.println("Building glass walls");
    }
}
