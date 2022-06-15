package com.mycompany.oraclepractice.soccer.event;

import com.mycompany.oraclepractice.soccer.play.Player;
import com.mycompany.oraclepractice.soccer.play.Team;
import java.util.Random;

/**
 *
 * @author AdnaK
 */
public class Goal extends GameEvent
{
    public Team theTeam;
    public Player thePlayer;
    public double theTime;
    
    int goal = 0;
    String gameName = null;
    
    public Goal()
    {
        super();
    }
    
    
    public static void Goal()
    {
        int goal = 100;
        
        Random rand = new Random();
        
        int randomGoal = rand.nextInt(goal);
        
        System.out.println("Random goal: " + randomGoal);
        
    }
    
    public String toString()
    {
        return "GOAL";
    }
}
