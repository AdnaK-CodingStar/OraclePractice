package com.mycompany.oraclepractice.soccer.play;

/**
 *
 * @author AdnaK
 */
public abstract class League
{
    public static void main(String[] args)
    {
        // Player thePlayer = new Player();
        // Player[] thePlayers;
        Team[] theTeams = createTeams();
        
        Game[] theGames = createGames(theTeams);
        
        Game currentGame = theGames[0];
        currentGame.playGame();
        
        System.out.println(currentGame.getDescription());
        
        /*for(Player thePlayer : team2.playerArray)
        {
            if(thePlayer.playerName.matches(".*Sab.*"))
            {
                System.out.println("Found: " + thePlayer.playerName);
                System.out.println("Last name is " + thePlayer.playerName.split(" ")[1]);
            }
        }*/
        
        StringBuilder familyNameFirst = new StringBuilder();
        
        /*for(Player thePlayer : team1.playerArray)
        {
            String name[] = thePlayer.playerName.split(" ");
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            familyNameFirst.delete(0, familyNameFirst.length());
        }*/
        
    }
    
    public static Team[] createTeams()
    {
        Team team1 = new Team();
        team1.teamName = "the Greens";
        
        Team team2 = new Team();
        team2.teamName = "the Reds";
        
        team1.playerArray[0] = new Player();
        team1.playerArray[0].playerName = "George Elliot";
        
        team1.playerArray[1] = new Player();
        team1.playerArray[1].playerName = "Graham Greene";
        
        team1.playerArray[2] = new Player();
        team1.playerArray[2].playerName = "Geoffrey Chaucer";
        
        
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        Team[] theTeams = {team1, team2};
        return theTeams;
    }
    
    public static Game[] createGames(Team[] theTeams)
    {
        Game theGame = new Game();
        
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        
        Game[] theGames = {theGame};
        return theGames;
    }
    
   public int sumLeague(int x, int y)
   {
       x = 2;
       y = 5; 
       int sumLeague = x + y;
       
       return sumLeague;
   }
   
   public void sumLeague(double one, double two, double three)
   {
       one = 3.5;
       two = 4.5;
       three = 5.5;
       
       int sumLeague = (int) ((one+two+three)/3);
   }
}
