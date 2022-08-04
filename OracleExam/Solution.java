package com.mycompany.oraclepractice.OracleExam;

/**
 *
 * @author AdnaK
 */
public class Solution
{
public static void main(String[] args)
{
    int n = 150;
    
    for(int i=1; i<n; i++)
    {
        if(i % 1 == 0 && i % i == 0)
        {
            System.out.println(i);
        }
    }
}
    
}
