package com.mycompany.oraclepractice.OracleExam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AdnaK
 */
public class SolutionIII
{
    /*
    Za dati niz cijelih brojeva brojeva Ai , potrebno je pronaći broj podskupova niza i čija suma elemenata se nalazi između [A, B] . Na primjer, za neki niz od 2 broja označeni redom sa A1 i A2 svi podskupovi su:

    { }, { A1 }, { A2 }, { A1 , A2 } i njihove sume elemenata su redom 0, A1, A2, A1 + A2

    Ulaz

    Standardni ulaz će se sastojati od 3 broja, N, A i B , pri čemu N predstavlja broj elemenata u nizu, dok je uloga brojeva A i B objašnjena u prethodnom dijelu zadatka. Zatim N brojeva koji označavaju članove niza I

    Izlaz

    Standardni izlaz treba se sastoji isključivo od jednog broja koji predstavlja broj podskupova čija je suma veća ili jednaka A i manja ili jednaka B.

    Primjer ulaza

    3 -1 2

    1 -2 3

    Primjer izlaza

    5

    Objašnjenje

    Postoji 5 podskupa čija je suma veća ili jednaka -1 i manja ili jednaka 2:

    {}, { 1 }, {1, -2}, {-2, 3} i {1, -2, 3}. Njihove odgovarajuće sume su: 0, 1, -1, 1 i 2
    */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        int sumPos = 0;
        int sumNeg = 0;
        int sumAll = 0;
        
        
        while(scanner.hasNextInt())
        {
            int i = scanner.nextInt();
            numbers.add(i);
        }
        
        for(Integer num : numbers)
        {
            if(num > 0)
                sumPos += num;
            else
                sumNeg -= num;
            
            sumAll = sumPos - sumNeg;
        }
        
        System.out.println(sumAll);
    }
    
}
