package com.mycompany.oraclepractice.soccer;

import com.mycompany.oraclepractice.Calculator;
import com.mycompany.oraclepractice.soccer.play.Game;
import com.mycompany.oraclepractice.Item;
import com.mycompany.oraclepractice.Shirt;
import com.mycompany.oraclepractice.ShoppingCart;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author AdnaK
 */
public class Main
{
    public static void main(String[] args)
    {
        String name1 = "John Smith";
        String name2 = "john Smith";
        String name3 = "John Smith";
        
        String txt = "My favourite person in the world is... whatever... favourite person...";
        System.out.println(txt.indexOf("person"));
        System.out.println(txt.lastIndexOf("person"));
        System.out.println(txt.indexOf('e'));
        System.out.println(txt.indexOf("person", 20));
        
        String s = "computer";
        System.out.println(s.substring(0,3));
        
        //Player player01 = new Player();
        //Player player02 = new Player(9.08, 90L, 90);
        //player02.setColour('A');
        
        LocalDate myDate = LocalDate.now();
        System.out.println("Today's date: " + myDate);
        
        LocalDate lDate = LocalDate.now();
        JapaneseDate jdate = JapaneseDate.from(lDate);
        System.out.println(jdate);
        
        
        LocalDateTime newDate = LocalDateTime.now();
        System.out.println(newDate);
        
        
        
        /*
        Shirt myshirt = new Shirt();
        System.out.println("Shirt colour: " + myshirt.colourCode);
        changeShirtColour(myshirt, "B");
        System.out.println("Shirt colour: " + myshirt.colourCode);
        */
        
        //System.out.println("Random goal from 0 to " + randomGoal);
        
        
        if(name1.equals(name3))
        {
            System.out.println("O da...");
        }
        else
            System.out.println("Nope...");
        
        if(name1.equalsIgnoreCase(name2))
        {
            System.out.println("O da...");
        }
        else
            System.out.println("Nope...");
        
        
        int x = 4, y = 9;
        
        int z = (((y/x)<3) ? (x += y) : (x *= y));
        System.out.println(z);
        
        
        
        
        String name = "Adna";
        String quess = "";
        int attempts = 0;
        while(!quess.equalsIgnoreCase(name))
        {
            quess = "";
            while(quess.length() < name.length())
            {
                char asciichar = (char) (Math.random()*26 + 97);
                quess += asciichar;
            }
            attempts++;
        }
        System.out.println(name + " found after " + attempts + " tries!");
        
        
        int[] numbers = new int[3];
        numbers[0] = 22;
        numbers[1] = 38;
        numbers[2] = 45;
        
        int sum = 0;
        
        for(int i=0; i<numbers.length; i++)
        {
            sum += numbers[i];
        }
        System.out.println(sum);
        
        
        ArrayList<String> animals = new ArrayList();
        
        animals.add("cat");
        animals.add("dog");
        animals.add("mouse");
        animals.add("cicada");
        animals.add("orangutan");
        animals.add(3, "horse");
        animals.add(1, "mammoth");
        
        animals.contains("mouse");
        animals.remove("orangutan");
        
        System.out.println(animals);
        
        
        Game game = new Game();
        game.namesArrays();
        System.out.println(game);
        
        game.gameTime();
        System.out.println(game);
        
        /*
        Shirt myShirt = new Shirt(' ', ' ');
        myShirt.display();
        System.out.println(myShirt);*/
        
        Item shirt = new Shirt(' ', "");
        shirt.display();
        if(shirt instanceof Shirt)
        {
            String colourCode = ((Shirt)shirt).getColour();
            System.out.println(colourCode);
        }
        else
            System.out.println("Nope...");
        
        
        //ArrayList --> List
        ArrayList<String> words = new ArrayList();
        List<String> theList = words;
        
        
        //Array --> ArrayList (List)
        String[] nums = {"one", "two", "three"};
        List<String> myList = Arrays.asList(nums);
        ArrayList<String> myArrayList = new ArrayList(myList);
        
        //Shortcut
        String[] nums2 = {"one", "two", "three"};
        ArrayList<String> myArrayList1 = new ArrayList(Arrays.asList(nums2));
        myArrayList1.replaceAll(a -> a.toUpperCase());
        System.out.println(myArrayList1);
        
        
        Calculator calculator = new Calculator();
        calculator.calculate();
        System.out.println(calculator);
        
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.displayTotal();
        System.out.println(shoppingCart);
        
        
    }

    /*public static void changeShirtColour(Shirt theShirt, String colour)
    {
        theShirt = new Shirt();
        theShirt.colourCode = colour;
    }

    private static class Shirt {

        private String colourCode;

        public Shirt() {
        }   
    }
    */
    
    public static void setItemFields(int one, int two, double three)
    {
                                                                                                                                                                                       
    }
    
    public static double setItemFields(int one, int two, int three, int four)
    {
        return one+two+three+four;
    }
    
    
    //System.out.println(games); - try doing it with an instance
    
    
    
}
