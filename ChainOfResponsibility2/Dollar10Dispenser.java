
package ChainOfResponsibility2;

public class Dollar10Dispenser implements DispenseChain{
    private DispenseChain d;
    public void setNextChain(DispenseChain d){
        this.d=d;
    }
    public void dispense(Currency cur){
        if(cur.getAmount()>=10){
            int num=cur.getAmount()/10;
            int remainder=cur.getAmount()%10;
            System.out.println("Dispensing\t"+num+" $10 notes");
            if(remainder!=0)
                d.dispense(new Currency(remainder));
        }else
            d.dispense(cur);
                
    }
    
}
