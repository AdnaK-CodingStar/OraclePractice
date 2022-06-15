package com.mycompany.oraclepractice.soccer.play;

import com.mycompany.oraclepractice.soccer.event.Goal;
import static com.mycompany.oraclepractice.soccer.play.Team.createTeams;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author AdnaK
 */
public class Game extends League implements Comparable, IDisplayDataItem
{
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    String gameName = null;
    
    public int team1points;
    public int team2points;
    
    public static String[] createGames()
    {
        String[] games = createTeams();
        return games;
    }
    
    public void getDescription()
    {
        Team team = new Team();
        
        String team1 = team.getTeamOne();
        String team2 = team.getTeamTwo();
        
        if(team1.equals(team2))
        {
            System.out.println("Winner is TeamTwo");
        }
        else
        {
            System.out.println("Winner is TeamOne");
        }
    }
    
    public void showBestTeam()
    {
        int team1points = 0;
        int team2points = 0;
        
        if(team1points==team2points)
        {
            this.team1points = team1points;
            this.team2points = team2points;
        }
        else
            System.out.println("Different points.");
    }
    public LocalDateTime gameTime()
    {
        LocalDateTime currentGame = LocalDateTime.now();
        System.out.println("Current game's time: " + currentGame);
        return currentGame;
    }
    
    
    
    
    public void namesArrays()
    {
        String names = "Alex, Cat, Maya, Lily";
        String namesArray[] = names.split(" ");
        System.out.print("[");
        
        ArrayList<String> namess = new ArrayList();
        
        for(int i=0; i<namesArray.length; i++)
        {
            System.out.print(namesArray[i]);
            for(int j=i; j<namess.size(); j++)
            {
                new ArrayList<String>(Arrays.asList(namesArray[j]));
            }
        }
        
        System.out.print("]");
        
        System.out.println(namess);
        
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
    
    
}