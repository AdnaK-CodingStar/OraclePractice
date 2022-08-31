package com.mycompany.oraclepractice.OracleExam;

/**
 *
 * @author AdnaK
 */
public class Buddy
{
    
    public static void main(String[] args)
    {
        def:
        for(short s=1; s<7; s++)
        {
            if(s == 5) break def;
            if(s == 2) continue;
            System.out.print(s + ".");
        }
    }
}
