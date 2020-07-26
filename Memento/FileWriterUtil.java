//Originator
package Memento;
public class FileWriterUtil {
    private String filename;
    private StringBuilder content;
    public FileWriterUtil(String filename){
        this.filename=filename;
        this.content=new StringBuilder();
    }
    public String toString(){
        return content.toString();
    }
    public void write(String str){
        content.append(str);
    }
    private class Memento{
        private String filename;
        private StringBuilder content;
        public Memento(String filename,StringBuilder content){
            this.content=new StringBuilder(content); //deep copy of content variables so that they dont refer to the same object
            this.filename=filename;
        }
    }
    public Memento save(){
        return new Memento(filename,content);
    }
    public void undoToLastSave(Object obj){
        Memento memento=(Memento)obj;
        filename=memento.filename;
        content=memento.content;
    }
}
