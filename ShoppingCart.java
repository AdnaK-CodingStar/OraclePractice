package com.mycompany.oraclepractice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author AdnaK
 */
public class ShoppingCart
{
    Item[] items = {new Item("Shirt", 25.60),
                    new Item("Wristband", 1.00),
                    new Item("Pants", 35.99)};
    
    ArrayList<String> itemsList = new ArrayList(Arrays.asList(items));
    
    public void displayTotal()
    {
        double total = 0;
        
        for(int i=0; i<items.length; i++)
        { 
           total += items[i].getPrice();
        }
        System.out.println();
    }
    
    public void removeItemFromCart()
    {
        itemsList.removeIf(s -> s.equals("Wristband"));
        itemsList.removeIf(s -> s.matches("Whatever..."));
    }
}
