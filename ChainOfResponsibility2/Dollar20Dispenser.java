
package ChainOfResponsibility2;

public class Dollar20Dispenser implements DispenseChain{
    private DispenseChain d;
    public void setNextChain(DispenseChain d){
        this.d=d;
    }
    public void dispense(Currency cur){
        if(cur.getAmount()>=20){
            int num=cur.getAmount()/20;
            int remainder=cur.getAmount()%20;
            System.out.println("Dispensing\t"+num+" $20 notes");
            if(remainder!=0)
                d.dispense(new Currency(remainder));
        }else
            d.dispense(cur);
                
    }
}
