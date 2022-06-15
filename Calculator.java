package com.mycompany.oraclepractice;

import java.io.PrintStream;

/**
 *
 * @author AdnaK
 */
public class Calculator extends ShoppingCart
{

    public void calculate()
    {
        double total = 0;
        try
        {
            if(total != 0 )
            {
                total /= 0;
            }
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Caught: " + ae.getMessage());
        }
    }
}
