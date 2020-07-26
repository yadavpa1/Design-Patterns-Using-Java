
package Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Meal{
    private List<Item> items=new ArrayList<Item>();
    void addItem(Item item)
    {
        items.add(item);
    }
    float getCost()
    { float cost=0.0f;
        for(Item item:items)
            cost=cost+item.price();
        return cost;
    }
    void showItems()
    {
        for(Item item:items)
        {
             System.out.println("ItemName:\t"+item.name());
             System.out.println("ItemPrice:\t"+item.price());
             System.out.println("ItemPacking:\t"+item.packing().getPacking());
        }
       
        
    }
}
