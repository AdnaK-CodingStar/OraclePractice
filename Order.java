package com.mycompany.oraclepractice;

/**
 *
 * @author AdnaK
 */
public class Order
{

    public static void main(String[] args)
    {
        /*
        Customer cust = new Customer(1);
        Customer customer = new Customer("John", "Smith", 'R');
        Item item = new Item();
        //item.price = 10.00; Won't compile
        item.setPrice(cust); //Ovako pozivaš metodu iz druge klase
        */
        Order order = new Order();
        order.calcDiscount("Nonprofit", 0);
        
        order.calcDiscountSwitch("Private", 0);
        
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.displayTotal();
        
    }
    
    public double calcDiscount(String customerType, double total)
    {   if(customerType=="Nonprofit")
        {
            if(total>900)
            {
                return total*10/100;
            }
            else
            {
                return total*8/100;
            }
        }
        else if(customerType=="Private")
        {
            if(total>900)
            {
                return total*7/100;
            }
            else
            {
                return 0.0;
            }
        }
        else if(customerType=="Corporation")
        {
            if(total>500)
            {
                return total*8/100;
            }
            else
            {
                return total*5/100;
            }
        }
        return total;
    }
    
   
    public double calcDiscountSwitch(String customerType, double total)
    {
        switch(customerType)
        {
            case "Nonprofit": return total>900 ? total*10/100 : total*8/100;
            case "Private": return total>900 ? total*7/100 : 0.0;
            case "Corporation": return total>500 ? total*8/100 : total*5/100;
        }
        return total;
    }

}
    

