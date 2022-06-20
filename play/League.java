package com.mycompany.oraclepractice.soccer.play;

/**
 *
 * @author AdnaK
 */
public abstract class League
{
    public static void main(String[] args)
    {
        Player player1 = new Player();
        player1.playerName = "George Elliot";
        
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        
        Player[] thePlayers = {player1, player2, player3};
        
        Team team1 = new Team();
        team1.teamName = "the Greens";
        team1.playerArray = thePlayers;
        
        Team team2 = new Team();
        team2.teamName = "the Reds";
        team2.playerArray = new Player[3];
        
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        
        team2.playerArray[2] = new Player();
        team2.playerArray[3].playerName = "Rafael Sabatini";
        
        Game currentGame = new Game();
        currentGame.homeTeam = team1;
        currentGame.awayTeam = team2;
        
        Goal goal1 = new Goal();
        goal1.thePlayer = currentGame.homeTeam.playerArray[2];
        goal1.theTeam = currentGame.homeTeam;
        goal1.theTime = 55;
        
        Goal[] theGoals = {goal1};
        currentGame.goals = theGoals;
        
        System.out.println("Goal scored after: " + currentGame.goals[0].theTime +
                " mins by " + currentGame.goals[0].thePlayer.playerName + 
                " of " + currentGame.goals[0].theTeam.teamName + ".");
        
        
        for(Player thePlayer : team2.playerArray)
        {
            if(thePlayer.playerName.matches(".*Sab.*"))
            {
                System.out.println("Found: " + thePlayer.playerName);
                System.out.println("Last name is " + thePlayer.playerName.split(" ")[1]);
            }
        }
        
        StringBuilder familyNameFirst = new StringBuilder();
        
        for(Player thePlayer : team1.playerArray)
        {
            String name[] = thePlayer.playerName.split(" ");
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            familyNameFirst.delete(0, familyNameFirst.length());
        }
        
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
