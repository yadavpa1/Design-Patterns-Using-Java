
package ChainOfResponsibility;

public class Manager extends LoanApprover{
    LoanApprover la;
    
    @Override
    public void setSuccessor(LoanApprover la)
    {
        this.la=la;
    }
    public void approve(Loan loan)
    {
        if(loan.loanAmount>=1000 && loan.loanAmount<2500)
            System.out.println("Manager Processing the request");
        else
            la.approve(loan);
    } 
    
}
