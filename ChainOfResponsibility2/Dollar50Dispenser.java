
package ChainOfResponsibility2;

public class Dollar50Dispenser implements DispenseChain{
    private DispenseChain d;
    
    public void setNextChain(DispenseChain d){
        this.d=d;
    }
            
    public void dispense(Currency cur){
        if(cur.getAmount()>=50){
            int num= cur.getAmount()/50;
            int remainder=cur.getAmount()%50;
            System.out.println("Dispensing\t"+num+" 50$ note");
            if(remainder!=0)
                d.dispense(new Currency(remainder));
        }
            else
                d.dispense(cur);
    }
}
