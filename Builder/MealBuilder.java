
package Builder;

public class MealBuilder {
   
    Meal prepareVegMeal()
    {
      Meal meal=new Meal();
     meal.addItem(new VegBurger());
     meal.addItem(new Pepsi());
     return meal;
    }
    Meal prepareNonVegMeal()
    { Meal meal=new Meal();
        meal.addItem(new NonVegBurger());
        meal.addItem(new Coke());
        return meal;
    }      
            
}
