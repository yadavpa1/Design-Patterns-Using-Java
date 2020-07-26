
package ChainOfResponsibility;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
    LoanApprover manager=new Manager();
    LoanApprover director=new Director();
    LoanApprover president=new President();
    manager.setSuccessor(director);
    director.setSuccessor(president);
    president.setSuccessor(null);
     
    int loanAmount;
    String loanType;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the loan amount to be passed");
    loanAmount=sc.nextInt();
    System.out.println("Enter the loan type");
    loanType=sc.next();
    Loan loan=new Loan(loanAmount,loanType);
    manager.approve(loan);
    }
}
