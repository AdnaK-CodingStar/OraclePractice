package com.mycompany.oraclepractice.OracleExam;

import java.util.Scanner;
/**
 *
 * @author AdnaK
 */
public class SolutionII
{    
    public static void main(String[] args)
    {
        /*
        Unijeti prirodan broj n koji predstavlja dimenzije kvadrata tj. n redova i n kolona. Unijeti red (r) i kolonu (k) u kvadratu dimenzija n*n koji je popunjen prirodnim brojevima 4,9,25, 49, ... koji imaju osobinu da imaju tačno tri djelioca, npr.

        4 ima tri djelioca 1, 2 ,4;

        9 ima tri djelioca 1,3, 9; ,,,

        Prvi red se popunjava s lijeva na desno, drugi red se popunjava s desna na lijevo, treći red se popunjava s lijeva na desno, četvrti red se popunjava s desna na lijevo, i tako naizmjenično do kraja. (Pogledajte sliku ispod)

        Za unesenu dimenziju kvadrata (n), zadani red (r) i zadanu kolonu (k) odrediti broj koji se nalazi na zadanoj poziciji.

        Primjer ulaza: 5 4 2

        Primjer izlaza: 4489

        Objašnjenje: U kvadratu dimenzija 5x5 se u 4. redu na 2. koloni nalazi broj 4489
        */
        
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int[] num = new int[9409];
        
        try
        {
            for(int i=0; i<=num.length-1; i++)
            {
                if(i % a == 0 && i % b == 0 && i % c == 0)
                {
                    System.out.println(num[i]);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}
