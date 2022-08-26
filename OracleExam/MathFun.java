package com.mycompany.oraclepractice.OracleExam;

import java.util.Arrays;

/**
 *
 * @author AdnaK
 */
public class MathFun
{
    
    public static void main(String[] args)
    {
        int number1 = 0b0111;
        int number2 = 0111_000;
        
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
        
        Arrays.asList("Fred", "Jim", "Sheila")
                .stream()
                .peek(System.out::println)
                .allMatch(s -> s.startsWith("F"));
    }
    
}
