package com.mycompany.oraclepractice.soccer.play;

import com.mycompany.oraclepractice.soccer.util.PlayerDatabase;
import com.mycompany.oraclepractice.soccer.util.PlayerDatabaseException;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *
 * @author AdnaK
 */
public class League
{
    public static void main(String[] args)
    {
        League theLeague = new League();
        
        try
        {
        Team[] theTeams = theLeague.createTeams("The Robins, The Crows, The Swallows", 3);
        
        Game[] theGames = theLeague.createGames(theTeams);
        
        System.out.println(theLeague.getLeagueAnnouncement(theGames));
        
        for(Game currentGame : theGames)
        {
            currentGame.playGame();
            System.out.println(currentGame.getDescription());
        }
        
        theLeague.showBestTeam(theTeams);
        
        theLeague.showBestPlayers(theTeams);
        }
        catch(Exception e)
        {
            e.printStackTrace(System.err);
        }
        
    }
    
    //METHODS
    
    public Team[] createTeams(String teamNames, int teamSize) throws PlayerDatabaseException
    {   
        PlayerDatabase playerDB = new PlayerDatabase();
        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        for(int i=0; i<theTeams.length; i++)
        {
            theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }
        
        Team team1 = new Team("the Greens", playerDB.getTeam(3));
        
        Team team2 = new Team("The Reds", playerDB.getTeam(3));
        
        return theTeams;
    }
    
    public Game[] createGames(Team[] theTeams)
    {
        int daysBetweenGames = 0;
        
        ArrayList<Game> theGames = new ArrayList();
        for(Team homeTeam : theTeams)
        {
            for(Team awayTeam : theTeams)
            {
                if(homeTeam != awayTeam)
                {
                    daysBetweenGames += 7;
                    theGames.add(new Game(homeTeam, awayTeam, LocalDateTime.now().plusDays(daysBetweenGames)));
                }
            }
        }
        return (Game[]) theGames.toArray(new Game[1]);
    }
   
    public void showBestTeam(Team[] theTeams)
    {
        Arrays.sort(theTeams);
        
        Team currentBestTeam = theTeams[0];
        System.out.println("\nTeam Points");
        
        for(Team currentTeam : theTeams)
        {
            System.out.println(currentTeam.getTeamName() + ":" + currentTeam.getPointsTotal()
            + ":" + currentTeam.getGoalsTotal());
        }
        System.out.println("Winner of the League is " + currentBestTeam.getTeamName());
    }
    
    public void showBestPlayers(Team[] theTeams)
    {
        ArrayList<Player> thePlayers = new ArrayList();
        for(Team currentTeam : theTeams)
        {
            thePlayers.addAll(Arrays.asList(currentTeam.getPlayerArray()));
        }
        
        System.out.println("\n\n Best Players");
        
        Collections.sort(thePlayers, (p1, p2) -> 
        Double.valueOf(p2.getGoalsScored()).compareTo
        (Double.valueOf(p1.getGoalsScored())));
        
        for(Player currentPlayer : thePlayers)
        {
            System.out.println(currentPlayer.getPlayerName() + " : " +
                    currentPlayer.getGoalsScored());
        }
    }
    
    public String getLeagueAnnouncement(Game[] theGames)
    {
        Period thePeriod = Period.between(theGames[0].getTheDateTime().toLocalDate(),
                theGames[theGames.length - 1].getTheDateTime().toLocalDate());
        
        return "The League is scheduled to run for " + 
                thePeriod.getMonths() + " month(s), and" +
                thePeriod.getDays() + " day(s) \n";
    }
    
}
