
package ChainOfResponsibility2;

public interface DispenseChain {
    public void setNextChain(DispenseChain d);
    public void dispense(Currency cur);
    
}
