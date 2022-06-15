package com.mycompany.oraclepractice.soccer.play;

/**
 *
 * @author AdnaK
 */
public abstract class League
{
    public static void main(String[] args)
    {
        
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
