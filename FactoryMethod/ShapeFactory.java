
package FactoryMethod;

public class ShapeFactory {
    public Shape getInstance(int c)
    {
        if(c==1)
            return new Circle();
        else if(c==2)
            return new Rectangle();
        else 
            return new Triangle(); 
    }
}
