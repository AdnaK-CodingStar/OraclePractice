package com.mycompany.oraclepractice.soccer.util;

import com.mycompany.oraclepractice.soccer.play.Player;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author AdnaK
 */
public class PlayerDatabase
{
    private ArrayList<Player> players = new ArrayList();
    
    public PlayerDatabase()
    {
        String authorList = null;
        StringTokenizer authorTokens = new StringTokenizer(authorList, ",");
        while(authorTokens.hasMoreTokens())
        {
            players.add(new Player(authorTokens.nextToken()));
        }
    }
    
    public Player[] getTeam(int numberOfPlayers)
    {
        Player[] teamPlayers = new Player[numberOfPlayers];
        for(int i=0; i<numberOfPlayers; i++)
        {
            int playerIndex = (int) (Math.random()*players.size());
            teamPlayers[i] = players.get(playerIndex);
            players.remove(playerIndex);
        }
        return teamPlayers;
    }
}
