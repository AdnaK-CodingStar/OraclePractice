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
        try
        {
        String authorList = "Cibrán Henriques, Nebuchadnezzar Expósito, Kirk Haber"
                + "Donndubán Bachman, Ranj Dirix, Quirinus Megalos";
        StringTokenizer authorTokens = new StringTokenizer(authorList, ",");
        while(authorTokens.hasMoreTokens())
        {
            players.add(new Player(authorTokens.nextToken()));
        }
        }
        catch(NullPointerException npe)
        {
            npe.printStackTrace(System.err);
        }
    }
    
    public Player[] getTeam(int numberOfPlayers) throws PlayerDatabaseException
    {
        Player[] teamPlayers = new Player[numberOfPlayers];
        for(int i=0; i<numberOfPlayers; i++)
        {
            int playerIndex = (int) (Math.random()*players.size());
            try
            {
            teamPlayers[i] = players.get(playerIndex);
            players.remove(playerIndex);
            }
            catch(IndexOutOfBoundsException io)
            {
                throw new PlayerDatabaseException("Not enough players in the database"
                        + " for the teams requested.");
            }
        }
        return teamPlayers;
    }
}
