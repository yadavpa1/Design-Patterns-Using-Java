
package ChainOfResponsibility2;

import java.util.Scanner;

public class ATMDispenser {
    private DispenseChain d1;
    public ATMDispenser(){
        d1=new Dollar50Dispenser();
        DispenseChain d2=new Dollar20Dispenser();
        DispenseChain d3=new Dollar10Dispenser();
        d1.setNextChain(d2);
        d2.setNextChain(d3);
    }
    public static void main(String[] args) {
        ATMDispenser atm=new ATMDispenser();
        int amount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount required");
        amount=sc.nextInt();
        atm.d1.dispense(new Currency(amount));
    }
}
