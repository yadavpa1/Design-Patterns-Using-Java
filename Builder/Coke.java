
package Builder;

public class Coke extends ColdDrink{
    @Override
    public float price() {
        return 50.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
