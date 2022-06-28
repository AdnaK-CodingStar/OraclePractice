package com.mycompany.oraclepractice.soccer.play;

import com.mycompany.oraclepractice.soccer.event.Goal;
import com.mycompany.oraclepractice.soccer.util.GameUtils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author AdnaK
 */
public class Game extends League implements Comparable, IDisplayDataItem
{
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    private LocalDateTime theDateTime;
    
    
    //CONSTRUCTORS
    public Game(Team homeTeam, Team awayTeam, LocalDateTime theDateTime)
    {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.theDateTime = theDateTime;
    }
    
    
    //METHODS
    public String getDescription()
    {
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        
        StringBuilder returnString = new StringBuilder();
        
        returnString.append(this.getHomeTeam().getTeamName() + " vs " + 
                this.getAwayTeam().getTeamName() + "\n" + 
                "Date" + this.theDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");
        
        for(Goal currentGoal : this.getGoals())
        {
            if(currentGoal.getTheTeam() == homeTeam)
            {
                homeTeamGoals++;
                homeTeam.incGoalsTotal(1);
            }
            else
            {
                awayTeamGoals++;
                awayTeam.incGoalsTotal(1);
            }
            
            returnString.append("Goal scored after: " + currentGoal.getTheTime() +
            " mins by " + currentGoal.getThePlayer().getPlayerName() + 
            " of " + currentGoal.getTheTeam().getTeamName() + ".\n");
        }    
        
        if(homeTeamGoals == awayTeamGoals)
        {
            returnString.append("It's a draw!");
            homeTeam.incPointsTotal(1);
            awayTeam.incPointsTotal(1);
        }
        else if(homeTeamGoals > awayTeamGoals)
        {
            returnString.append(returnString.append(homeTeam.getTeamName() + " win!"));
            homeTeam.incPointsTotal(2);
        }
        else
        {
            returnString.append(returnString.append(awayTeam.getTeamName() + " win!"));
            awayTeam.incPointsTotal(2);
        }
        
        returnString.append(" (" + homeTeamGoals + " - " + awayTeamGoals + ") \n");
        
        return returnString.toString();
    }
    
    public void playGame()
    {
        playGame(6);
    }
    
    
    public void playGame(int maxGoals)
    {       
        int numberOfGoals = (int)(Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numberOfGoals];
        this.setGoals(theGoals);
        GameUtils.addGameGoals(this);
    }
    
    
    public LocalDateTime gameTime()
    {
        LocalDateTime currentGame = LocalDateTime.now();
        System.out.println("Current game's time: " + currentGame);
        return currentGame;
    }
    

    @Override
    public void compare() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    
    //GETTERS & SETTERS
    /**
     * @return the homeTeam
     */
    public Team getHomeTeam()
    {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam)
    {
        this.homeTeam = homeTeam;
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam()
    {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam)
    {
        this.awayTeam = awayTeam;
    }

    /**
     * @return the goals
     */
    public Goal[] getGoals()
    {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(Goal[] goals)
    {
        this.goals = goals;
    }

    public LocalDateTime getTheDateTime()
    {
        return theDateTime;
    }

    public void setTheDateTime(LocalDateTime theDateTime)
    {
        this.theDateTime = theDateTime;
    }
    
    
    
}
