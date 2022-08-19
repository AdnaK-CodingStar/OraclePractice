package com.mycompany.oraclepractice.OracleExam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author AdnaK
 */
public class TestClass
{
    public static void main(String[] args)
    {
        List items = new ArrayList<>();
        items.add("Pen");
        items.add("Pencil");
        items.add("Box");
        for (Iterator it = items.iterator(); it.hasNext();) {
            String i = (String) it.next();
            if(i.indexOf("P") == 0)
            {
                continue;
            }
            else
                System.out.println(i + " ");
        }
    }
}
