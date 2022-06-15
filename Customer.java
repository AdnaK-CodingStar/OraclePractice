package com.mycompany.oraclepractice;

/**
 *
 * @author AdnaK
 */
class Customer {

    boolean hasLoyalDiscount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int ID;
    private String name;
    private String surname;
    private char fColour = 'U'; 
    private final static String ssn = "Warning: Do Not Modify!";
    
    //CONSTRUCTOR
    public Customer(int ID)
    {
        setID(ID);
    }
    
    public Customer(String name, String surname, char fColour)
    {
        setName(name);
        this.surname = surname;
        setFColour(fColour);
    }
    
    
    //GETTERS & SETTERS
    public int getID()
    {
        return ID;
    }
    
    public void setID(int ID)
    {
        this.ID = ID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    
    public char getFColour()
    {
        return fColour;
    }
    
    public void setFColour(char fColour)
    {
        this.fColour = fColour;
        
        if(fColour != 'R')
        {
            System.out.println("Not a colour. Type 'R', 'G' or 'B'.");
        }
        else if(fColour != 'G')
        {
            System.out.println("Not a colour. Type 'R', 'G' or 'B'.");
        }
        else if(fColour != 'B')
        {
            System.out.println("Not a colour. Type 'R', 'G' or 'B'.");
        }
        else
            System.out.println(getFColour());
    }
            
    public String getSsn()
    {
        return ssn;
    }
    
    
}
