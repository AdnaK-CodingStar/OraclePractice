package com.mycompany.oraclepractice.soccer.play;

/**
 *
 * @author AdnaK
 */
public class Player implements Comparable
{
    public String playerName;
    private char age;
    private int dateOfBirth;
    private double effiency;
    private long activeDays = 0L;
    
    private int activeDayss = (int) activeDays;
    
    private char colour;
    
    
    //CONSTRUCTORS
    /*public Player(String firstName, char age, int dateOfBirth, char colour)
    {
        this.firstName = firstName;
        setAge(age);
        setDateOfBirth(dateOfBirth);
        this.colour = colour;
    }
    
    public Player(double effiency, long activeDays, int activeDayss)
    {
        this.effiency = effiency;
        setActiveDays(activeDays);
        setActiveDayss(activeDayss);
    }
    */
    
    
    //GETTERS & SETTERS
    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public char getAge()
    {
        return age;
    }

    public void setAge(char age)
    {
        this.age = age;
    }

    public int getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public double getEffiency()
    {
        return effiency;
    }

    public void setEffiency(double effiency)
    {
        this.effiency = effiency;
    }

    public long getActiveDays()
    {
        return activeDays;
    }

    public void setActiveDays(long activeDays)
    {
        this.activeDays = activeDays;
    }

    public int getActiveDayss()
    {
        return activeDayss;
    }

    public void setActiveDayss(int activeDayss)
    {
        this.activeDayss = activeDayss;
    }
    
    public char getColour()
    {
        return colour;
    }
    
    public void setColour(char colour)
    {
        this.colour = colour;
    }    

    @Override
    public void compare() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
