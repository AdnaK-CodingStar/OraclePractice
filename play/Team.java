package com.mycompany.oraclepractice.soccer.play;


/**
 *
 * @author AdnaK
 */
public class Team extends Player implements Comparable, IDisplayDataItem
{
    private String teamName;
    private Player[] playerArray;
    private int pointsTotal;
    private int goalsTotal;
    

    //CONSTRUCTORS
    
    public Team(String teamName)
    {
        this.teamName = teamName;
    }
    
    public Team(String teamName, Player[] players)
    {
        this(teamName);
        this.playerArray = players;
    }
    
    public Team()
    {
        
    }
    
    //GETTERS & SETTERS
    
    public int getPointsTotal()
    {
        return pointsTotal;
    }

    public void setPointsTotal(int pointsTotal)
    {
        this.pointsTotal = pointsTotal;
    }
    
    public int getGoalsTotal()
    {
        return goalsTotal;
    }

    public void setGoalsTotal(int goalsTotal)
    {
        this.goalsTotal = goalsTotal;
    }
    
    /**
     * @return the teamName
     */
    public String getTeamName()
    {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    /**
     * @return the playerArray
     */
    public Player[] getPlayerArray()
    {
        return playerArray;
    }

    /**
     * @param playerArray the playerArray to set
     */
    public void setPlayerArray(Player[] playerArray)
    {
        this.playerArray = playerArray;
    }
    

    //METHODS
    
    public void incPointsTotal(int pointsTotal)
    {
        this.pointsTotal += pointsTotal;
    }
    
    public void incGoalsTotal(int goals)
    {
        this.goalsTotal = this.goalsTotal + goals;
    }

    @Override
    public boolean isDetailAvailable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDisplayDetail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDetailType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Object theTeam)
    {
        int returnValue = -1;
        if(this.getPointsTotal() < ((Team)theTeam).getPointsTotal())
        {
            returnValue = 1;
        }
        else if(this.getPointsTotal() == ((Team)theTeam).getPointsTotal())
        {
            if(this.getGoalsTotal() < ((Team)theTeam).getGoalsTotal())
            {
                returnValue = 1;
            }
        }
        return returnValue;
    }
    
}
