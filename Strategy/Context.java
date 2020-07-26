// context object whose behavior varies as per its strategy object.
//The strategy object changes the executing algorithm of the context object.
package Strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy s){
        this.strategy=s;
    }
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1, num2);
    }
}
