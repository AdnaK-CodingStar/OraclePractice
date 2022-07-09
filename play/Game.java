package com.mycompany.oraclepractice.soccer.play;

import com.mycompany.oraclepractice.soccer.event.GameEvent;
import com.mycompany.oraclepractice.soccer.event.Goal;
import com.mycompany.oraclepractice.soccer.event.Possession;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author AdnaK
 */
public class Game extends League implements Comparable, IDisplayDataItem
{
    private Team homeTeam;
    private Team awayTeam;
    private GameEvent[] gameEvents;
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
        
        for(GameEvent currentEvent : this.getEvents())
        {
            if(currentEvent instanceof Goal)
            {
                if(currentEvent.getTheTeam() == homeTeam)
                {
                    homeTeamGoals++;
                    homeTeam.incGoalsTotal(1);
                }
                else
                {
                    awayTeamGoals++;
                    awayTeam.incGoalsTotal(1);
                }
                currentEvent.getThePlayer().incGoalsScored();
            }
            
            returnString.append(currentEvent + " after: " + currentEvent.getTheTime() +
            " mins by " + currentEvent.getThePlayer().getPlayerName() + 
            " of " + currentEvent.getTheTeam().getTeamName() + ".\n");
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
        ArrayList<GameEvent> eventList = new ArrayList();
        GameEvent currentEvent;
        for(int i=1; i<=90; i++)
        {
            if(Math.random() > 0.8)
            {
                //System.out.println(i);
                currentEvent = Math.random() > 0.8 ? new Goal() : new Possession();
                currentEvent.setTheTeam(Math.random() > 0.5 ? homeTeam : awayTeam);
                currentEvent.setThePlayer(currentEvent.getTheTeam().
                             getPlayerArray()[(int) Math.random() *
                             currentEvent.getTheTeam().getPlayerArray().length]);
                currentEvent.setTheTime(i);
                eventList.add(currentEvent);
            }
        }
        this.gameEvents = new Goal[eventList.size()];
        eventList.toArray(gameEvents);
    }
    
    
    public LocalDateTime gameTime()
    {
        LocalDateTime currentGame = LocalDateTime.now();
        System.out.println("Current game's time: " + currentGame);
        return currentGame;
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
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
     * @return the gameEvents
     */
    public GameEvent[] getEvents()
    {
        return gameEvents;
    }

    /**
     * @param gameEvents the gameEvents to set
     */
    public void setEvents(GameEvent[] gameEvents)
    {
        this.gameEvents = gameEvents;
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
