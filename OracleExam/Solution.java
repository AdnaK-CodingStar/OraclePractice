package com.mycompany.oraclepractice.OracleExam;

/**
 *
 * @author AdnaK
 */
public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i=147; i<n; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i-10 + " ");
            }
        }
    }   
}
