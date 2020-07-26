
package Interpreter;

public class Demo {
   //Rule: Robert and John are male
    public static Expression getMaleExpression(){
        Expression robert=new TerminalExpression("Robert");
        Expression john=new TerminalExpression("John");
        return new OrExpression(robert,john);
    }
    
    //Rule:Julie is a married person
    public static Expression getMarriedWomanExpression(){
        Expression julie=new TerminalExpression("Julie");
        Expression married=new TerminalExpression("married");
        return new AndExpression(julie,married);
    }
    public static void main(String[] args) {
        Expression isMale=getMaleExpression();
        Expression isMarriedWoman=getMarriedWomanExpression();
        System.out.println("John is male? "+isMale.interpret("John"));
        System.out.println("Julie is a married woman? "+isMarriedWoman.interpret("married Julie"));
    }
}
