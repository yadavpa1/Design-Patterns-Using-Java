
package ChainOfResponsibility;

public class President extends LoanApprover{
    LoanApprover la;
    public void setSuccessor(LoanApprover la)
    {
        this.la=null;
    }
     public void approve(Loan loan)
    {
        if(loan.loanAmount>=5000)
            System.out.println("President Processing the request");
        else
            la.approve(loan);
    } 
}
