
package ChainOfResponsibility;

public abstract class LoanApprover {
    LoanApprover la;
    abstract public void setSuccessor(LoanApprover la);
    abstract public void approve(Loan loan);
}
