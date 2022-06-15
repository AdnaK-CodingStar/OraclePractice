package com.mycompany.oraclepractice;

/**
 *
 * @author AdnaK
 */
public class Shirt extends Item
{
    public char fit = 'M';
    public String colour = "Green";

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public String getColour() {
        colour = "Green";
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDescription() {
        description = "Shirt";
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        description = "Shirt";
    }

    public int getID() {
        ID = 1;
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
        ID = 1;
    }

    public double getPrice() {
        price = 22.00;
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        price = 22.00;
    }

    

    @Override
    public void display()
    {
        super.display();
        setDescription("Shirt");
        setID(1);
        setPrice(22.00);
    }
    
    public Shirt(char fit, String colour)
    {
        this("Shirt", 22.00);
        this.fit = fit;
        this.colour = colour;
    }
    
    public Shirt(String cloth, double price)
    {
        super(cloth, price);
    }
    
    
}
