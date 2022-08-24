package com.mycompany.oraclepractice.OracleExam;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author AdnaK
 */
public class TestFun
{
    
    public static void main(String[] args)
    {
        List nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.stream()
            //.filter(n -> n%2 == 0)
            .forEach(s -> System.out.print(" " + s));
    }
    
}
