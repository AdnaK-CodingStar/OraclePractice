package com.mycompany.oraclepractice.OracleExam;

/**
 *
 * @author AdnaK
 */
public class Test
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 2;
        try
        {
            for(int z = 2; z >= 0; z--)
            {
                int ans = x/z;
                System.out.print(ans + " ");
            }
        }
        catch(Exception e1)
        {
            System.out.println("E1");
        }
    }
    
}
