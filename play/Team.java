package com.mycompany.oraclepractice.soccer.play;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author AdnaK
 */
public class Team extends Player implements Comparable, IDisplayDataItem
{
    public String teamName;
    public Player[] playerArray;
    
    
    String[] teams = {};
    
        String teamOne; /*= "Player2", "Player3", "Player4", "Player5", "Player6",
                            "Player7", "Player8", "Player9", "Player10", "Player11";*/
        
        String teamTwo; /*= {"PlayerOne", "PlayerTwo", "PlayerThree", "PlayerFour",
                            "PlayerFive", "PlayerSix", "PlayerSeven", "PlayerEight",
                            "PlayerNine", "PlayerTen", "PlayerEleven"};
        */
        
    public static String[] createTeams()
    {
        String[] teams = new String[2];
        
        return teams;
    }
    
    ArrayList<Team> teamsList = new ArrayList(Arrays.asList(teams));

    /*
    public Team(String firstName, char age, int dateOfBirth, char colour)
    {
        super(firstName, age, dateOfBirth, colour);
    }*/

    public Team() {
        this.teamOne = "Player1";
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getTeamOne()
    {
        return teamOne;
    }
    
    public String getTeamTwo()
    {
        return teamTwo;
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
