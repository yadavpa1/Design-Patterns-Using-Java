
package FactoryMethod;

import java.util.Scanner;

public class DesignPatterns {
    public static void main(String[] args) {
        System.out.println("1.Circle\n2.Rectangle\n3.Traingle\nEnter your choice:");
        Scanner sc=new Scanner(System.in);
        int c= sc.nextInt();
        ShapeFactory f=new ShapeFactory();
        f.getInstance(c).draw();
        }
    }
    
abstract class Shape
{
    abstract void draw();
}




