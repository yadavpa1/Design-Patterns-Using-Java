
package Observer;

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subj){
        this.subject=subj;
        subject.attach(this);
    }
    public void update(){
        System.out.println("Binary string "+Integer.toBinaryString(subject.getState()));
    }
}
