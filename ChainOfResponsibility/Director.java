
package ChainOfResponsibility;

public class Director extends LoanApprover{
    LoanApprover la;
    public void setSuccessor(LoanApprover la)
    {
        this.la=la;
    }
    public void approve(Loan loan)
    {
        if(loan.loanAmount>=2500 && loan.loanAmount<5000)
            System.out.println("Director Processing the request");
        else
            la.approve(loan);
    } 
}
