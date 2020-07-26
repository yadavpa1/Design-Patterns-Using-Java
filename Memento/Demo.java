
package Memento;

public class Demo {
    public static void main(String[] args) {
         FileWriterCareTaker caretaker=new FileWriterCareTaker();
         FileWriterUtil writer = new FileWriterUtil("data.txt");
         writer.write("first set of data");
         System.out.println(writer);
         System.out.println("");
         caretaker.save(writer); //saving file
         writer.write("second set of data"); //writing something else
         System.out.println(writer); //checking file contents
         System.out.println("");
         caretaker.undo(writer); //undo
         System.out.println(writer);
         
    }
   
    
    
}
