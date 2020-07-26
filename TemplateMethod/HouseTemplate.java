//builldHouse() is the template method and defines the order of execution for performing several steps.
package TemplateMethod;

public abstract class HouseTemplate {
    //final so that subclasses cant override
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }
    public abstract void buildWalls();
    public abstract void buildPillars();
    private void buildFoundation(){
        System.out.println("Building foundation");
    }
    private void buildWindows(){
        System.out.println("Building glass windows");
    }
}
