package com.mycompany.oraclepractice.soccer.play;

import com.mycompany.oraclepractice.soccer.event.Goal;
import static com.mycompany.oraclepractice.soccer.play.Team.createTeams;
import java.time.LocalDateTime;
/**
 *
 * @author AdnaK
 */
public class Game extends League implements Comparable, IDisplayDataItem
{
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    
    
    //CONSTRUCTORS
    public Game(Team homeTeam, Team awayTeam)
    {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
    
    
    //METHODS
    public String getDescription()
    {
        StringBuilder returnString = new StringBuilder();
        
        for(Goal currentGoal : this.getGoals())
        {
            returnString.append("Goal scored after: " + currentGoal.getTheTime() +
            " mins by " + currentGoal.getThePlayer().getPlayerName() + 
            " of " + currentGoal.getTheTeam().getTeamName() + ".\n");
        }    
        
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
    
    /*public void showBestTeam()
    {
        int team1points = 0;
        int team2points = 0;
        
        if(team1points==team2points)
        {
            this.setTeam1points(team1points);
            this.setTeam2points(team2points);
        }
        else
            System.out.println("Different points.");
    }*/
    
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
    
}
