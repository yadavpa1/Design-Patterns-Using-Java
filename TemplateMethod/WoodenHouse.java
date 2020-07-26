
package TemplateMethod;

public class WoodenHouse extends HouseTemplate{
    public void buildPillars(){
        System.out.println("Building Pillars with wood coating");
    }
    public void buildWalls(){
        System.out.println("Building wooden walls");
    }
}
