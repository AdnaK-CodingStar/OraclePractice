package com.mycompany.oraclepractice;

/**
 *
 * @author AdnaK
 */
public class Item
{
    String description = " ";
    int ID = 0;
    public double price = 0;

    public Item(String cloth, double price)
    {
        
    }
    
    public void setPrice(Customer cust)
    {
        if(cust.hasLoyalDiscount())
        {
            price = price*.85;
        }
    }
    
    public void display()
    {
        System.out.println("Item description: " + getDescription());
        System.out.println("ID: " + getID());
        System.out.println("price: " + getPrice());
    }
    /*
    public String toString()
    {
        return "Item description: " + getDescription()
                + "ID: " + getID()
                + "price: " + getPrice();
    }*/

    //GETTER & SETTERS
    
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
    
    
}
