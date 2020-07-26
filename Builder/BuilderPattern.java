
package Builder;

public class BuilderPattern {
    public static void main(String[] args) {
        MealBuilder builder =new MealBuilder();
        Meal vegMeal=builder.prepareVegMeal();
        vegMeal.showItems();
       System.out.println("Total cost:\t"+vegMeal.getCost());
        Meal nonVegMeal=builder.prepareNonVegMeal();
        System.out.println("===============================");
        nonVegMeal.showItems();
        System.out.println("Total cost:\t"+nonVegMeal.getCost());
    }
}
