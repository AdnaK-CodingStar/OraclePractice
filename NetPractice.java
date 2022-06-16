package com.mycompany.oraclepractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.tan;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
import static javafx.util.Duration.seconds;

/**
 *
 * @author AdnaK
 */
public class NetPractice
{
    /*private static final double radius = 7.5;
    private static final double width = 5.5;
    private static final double height = 8.5;*/
    
    public static void main(String[] args)
    {
        /*
        //1.
        System.out.println("Hello");
        System.out.println("Adna");
        
        //2.
        int a = 74;
        int b = 36;
        System.out.println(a+b);
        
        //3.
        double c = 50;
        int d = 3;
        double divide = c/d;
        System.out.println(divide);
        
        //4.
        int e = -5 + 8 * 6;
        double f = (55+9) % 9;
        int g = 20 + -3*5 / 8;
        double h = 5 + 15 / 3 * 2 - 8 % 3;
        
        System.out.println(e + "\n" + f + "\n" + g + "\n" + h + "\n");
        
        //5.
        Scanner input = new Scanner(System.in);
        
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        
        int sum = firstNum*secondNum;
        System.out.println(sum);
        
        //6.
        int firstInputNum = input.nextInt();
        int secondInputNum = input.nextInt();
        
        int addition = firstInputNum + secondInputNum;
        int multiply = firstInputNum*secondInputNum;
        int subtract = firstInputNum - secondInputNum;
        int divide2 = firstInputNum/secondInputNum;
        int remainder = firstInputNum%secondInputNum;
        System.out.println(addition + "\n" + multiply + "\n" + subtract + "\n" + divide2 + "\n" + remainder);
        
        //7.
        int inputNum = input.nextInt();
        for(int i=0; i<=10; i++)
        {
            int table = inputNum*i;
            System.out.println(table);
            System.out.println(inputNum + " x " + i + " = " + (inputNum * i));
        }
        
        //8.
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a ");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        
        //9.
        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(result);
        
        //10.
        double result1 = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result1);
        
        //11.
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        
        System.out.println(perimeter + "\n" + area);
        
        //12.
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        
        double result2 = (one+two+three)/3;
        
        System.out.println(result2);
        
        //13.
        double perimeterR = 2*(height+width);
        double areaR = height*width;
        
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeterR);
        System.out.printf("Area is %.1f*%.1f = %.2f \n", height, width, areaR);
        */
        
        //14.
        /*System.out.println("****=======");
        System.out.println("****=======");
        System.out.println("****=======");
        System.out.println("===========");
        System.out.println("===========");
        
        String flag1 = "****=======";
        String flag2 = "===========";
        
        for(int i=0; i<4; i++)
        {
            System.out.println(flag1);
        }
        for(int i=0; i<3; i++)
        {
            System.out.println(flag2);
        }
        
        //15.
        int temp;
        int a = 5;
        int b = 6;
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("A: " + a + " & B: " + b);
        
        //16.
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
        
        //31.
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Versione: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
        
        //32.
        Scanner input = new Scanner(System.in);
        int compareNum1 = input.nextInt();
        int compareNum2 = input.nextInt();
        
        if(compareNum1 == compareNum2)
        {
            System.out.println(compareNum1 + "=" + compareNum2);
        }
        if(compareNum1 != compareNum2)
        {
            System.out.println(compareNum1 + "!=" + compareNum2);
        }
        if(compareNum1 <= compareNum2)
        {
            System.out.println(compareNum1 + "<=" + compareNum2);
        }
        if(compareNum1 >= compareNum2)
        {
            System.out.println(compareNum1 + ">=" + compareNum2);
        }
        if(compareNum1 < compareNum2)
        {
            System.out.println(compareNum1 + "<" + compareNum2);
        }
        if(compareNum1 > compareNum2)
        {
            System.out.println(compareNum1 + ">" + compareNum2);
        }*/
        
        //33. 
        /*
        Scanner input = new Scanner(System.in);
        
        int sumInteger = input.nextInt();
        String number = String.valueOf(sumInteger);
        
        char[] sumDigits = number.toCharArray();
        
        int sum = 0;
        
        for(int i=0; i<sumDigits.length; i++)
        {
            sum = sum + sumDigits[i];
        }
        System.out.println(sum); NOPE!
        
        System.out.println(sumDigits(sumInteger));
    }
        public static int sumDigits(int sumInteger)
        {
        int sum = 0;
        while (sumInteger != 0) {
            sum += sumInteger % 10;
            sumInteger /= 10;
        }
        return sum;
        */
        
        //34.
       /* 
        Scanner input = new Scanner(System.in);
        
        double s = input.nextDouble();
        
        System.out.println(hexagonArea(s));
    }
    public static double hexagonArea(double s)
    {
        return (6*(s*s))/(4*Math.tan(Math.PI/6));
    }*/

        //35.
      /*  Scanner scanner = new Scanner(System.in);
        
        double n = scanner.nextDouble();
        double s = scanner.nextDouble();
        
        System.out.println(polygonArea(n, s));
    }
    
    public static double polygonArea(double n, double s)
    {
        return (n*(s*s))/(4*Math.tan(Math.PI/n));
    }*/
        
        //36.
     /*   
        Scanner scanner = new Scanner(System.in);
        
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        System.out.println(distance(x1, y1, x2, y2));
    }
    
    public static double distance(double x1, double y1, double x2, double y2)
    {
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        
        double radius = 6371.01;
        
        return radius*Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
    }*/
        
        //37.
        /* 1. način
        Scanner scanner = new Scanner(System.in);
        char[] letters = scanner.nextLine().toCharArray();
        
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }*/
        
        /* 2. način
        Scanner scanner = new Scanner(System.in);
        
        String string = scanner.nextLine();
        String reverse = "";
        char letters;
        
        for(int i=0; i<string.length(); i++)
        {
            letters = string.charAt(i);
            reverse = letters + reverse;
        }
        
        System.out.println(reverse);*/
        
        //38.
        /*
        String text = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        
        count(text);
        
        
    }
    
    public static void count(String test)
    {
        char[] counting = test.toCharArray();
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int other = 0;
        
        for(int i=0; i<test.length(); i++)
        {
            if(Character.isLetter(counting[i]))
            {
                letters++;
            }
            else if(Character.isSpaceChar(counting[i]))
            {
                spaces++;
            }
            else if(Character.isDigit(counting[i]))
            {
                numbers++;
            }
            else
            {
                other++;
            }
        }
        
        System.out.println(letters);
        System.out.println(spaces);
        System.out.println(numbers);
        System.out.println(other);*/
        
        //39.
        /*
        int amount = 0;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=4; j++)
            {
                for(int k=1; k<=4; k++)
                {
                    if(k!=i && k!=j && i!=j)
                    {
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println(amount);*/
        
        //40.
        /*
        for(String str : Charset.availableCharsets().keySet())
        {
            System.out.println("List of charsets: " + str);
        }*/
        
        //41.
        /*
        int chr = 'Z';
	System.out.println("The ASCII value of Z is :"+chr);*/
        
        //43.
        /*System.out.println("Twinkle, twinkle, little star, \n\tHow I wonder what you are! "
                + "\n\t\tUp above the world so high, \n\t\tLike a diamond in the sky."
                + "\nTwinkle, twinkle, little star, \n\tHow I wonder what you are");*/
        
        
        //44.
        /*Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        System.out.printf("Sum or whatever of %d + %d%d + %d%d%d", n, n, n, n, n, n);*/
        
        //45.
        /*System.out.println("Size of a file: " + new File("abc.txt").length());*/
        
        //46.
        /*LocalDateTime newDate = LocalDateTime.now();
        System.out.println(newDate);*/
        
        //47.
        /*
        for(int i=0; i<100; i++)
        {
            if(i%2 != 0)
            {
                System.out.println(i);
            }
        }*/
        
        //48.
        /*SimpleDateFormat dateformat = new SimpleDateFormat("dd.MM.yyyy. HH:mm:ss.SSS");
        dateformat.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        
        System.out.println("Now: " + dateformat.format(System.currentTimeMillis()));*/
        
        //49.
        /*Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        if(num%2 != 0)
        {
            System.out.println(num + " is odd");
        }
        else
        {
            System.out.println(num + " is even");
        }*/
        
        //50.
        /*for(int i=0; i<100; i++)
        {
            if(i%3 == 0)
            {
                System.out.println("Divided by 3: ");
                System.out.println(i);
            }
            if(i%5 == 0)
            {
                System.out.println("Divided by 5: ");
                System.out.println(i);
            }
            if(i%3 == 0 && i%3 == 0)
            {
                System.out.println("Divided by 3 and 5: ");
                System.out.println(i);
            }
        }*/
        
        //51.
        /*String numS = "25";
        int numI = Integer.parseInt(numS);
        
        System.out.println(numS);
        System.out.println(numI);*/
        
        //52.
        /*Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int sum = num1 + num2;
        if(sum == num3)
        {
            System.out.println("True!");
        }
        else
            System.out.println("False!");*/
        
        //53.
        /*Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num2>num1 && num3>num2)
        {
            System.out.println("TRue!");
        }
        else if(num3>num2)
        {
            System.out.println("True!");
        }*/
        /*
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        System.out.println("Result: " + test(num1, num2, num3, true));
        
        
    }
    
    public static boolean test(int num1, int num2, int num3, boolean num1num2num3)
    {
        if(num1num2num3)
            return (num3>num2);
        return (num2>num1 && num3>num2);
    }*/
        
     
        //54.
        /*Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        System.out.println(test(num1, num2, num3, true));
    
    }   
    
    public static boolean test(int num1, int num2, int num3, boolean num1num2num3)
    {
        return (num1%10 == num2%10) || (num2%10 == num3%10) || (num3%10 == num1%10);
    }*/
        
        //56.
        /*int x = 5;
        int y = 20;
        int p = 3;
        
        for(int sol=x; sol<=y; sol++)
        {
            boolean sum = sol%p == 0;
            if(sum)
            {
                System.out.println("Sol: " + sol + " & sum: " + sum);
            }
            else
                System.out.println("...");
        }
        System.out.println("Whatever...");*/
        
        //58.
        /*Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String upperCaseSentence = "";
        
        Scanner lineScan = new Scanner(sentence);
        while(lineScan.hasNext())
        {
            String word = lineScan.next();
            upperCaseSentence += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upperCaseSentence.trim());
        */
        
        //59.
        /*Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String lowerCaseSentence = "";
        
        Scanner lineScan = new Scanner(sentence);
        while(lineScan.hasNext())
        {
            String word = lineScan.next();
            lowerCaseSentence += word.toLowerCase() + " ";
        }
        System.out.println(lowerCaseSentence);*/
        
        //60.
        /*
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        
        String[] word = sentence.split("[ ]+");
        
        System.out.println(word[word.length - 2]);*/
        
        //61.
        /*
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String reverse = "";
        char[] letters = word.toCharArray();
        
        for(int i=word.length()-1; i>=0; i--)
        {
            reverse += letters[i];
        }
        
        System.out.println(reverse);*/
        
        //62.
        /*Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        */
        
        //66.
        /*int sum = 0;
        
        for(int i=0; i<=100; i++)
        {
            sum += i;
        }
        System.out.println(sum);*/
        
        //67.
        /*String txt1 = "Python 3.0";
        String txt2 = "Tutorial";
        
        System.out.println(txt1.substring(0, 7) + txt2 + " " + txt1.substring(7, 10));
        */
        
        //68.
        /*String word = "Python";
        System.out.println(word.substring(0, 3));
        */
        
        //69.
        /*String word1 = "Python";
        String word2 = "Tutorial";
        
        System.out.println(word1.substring(1, 6) + word2.substring(1, 8));
        */
        
        //73.
        /*String word1 = "Python";
        String word2 = "";
        
        if(word2 == "")
        {
            word2 = "#";
        }
        
        System.out.println(word1.substring(0, 1) + word2);
        */
        
        //74.
        /*int[] array = {10, -20, 0, 30, 40, 60, 10};
        
        if(array.length >= 2)
        {
            if(array[0] == 10 || array.length - 1 == 10)
            {
                System.out.println("true");
            }
            
        }*/
        
        //75.
        /*
        int[] array = {50, -20, 0, 30, 40, 60, 10};
        
        if(array.length >= 2)
        {
            if(array[0] == array.length - 1)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }*/
        
        //76.
        /*int[] array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] array2 = {45, 20, 10, 20, 30, 50, 11};
        
        if(array1.length >= 2 && array2.length >= 2)
        {
            if(array1[0] == array2[0] || array1[array1.length - 1] == array2[array2.length - 1])
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }*/
        
        //77.
        /*int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};
        
        int[] array3 = {array1[0], array2[array2.length-1]};
        
        System.out.println(Arrays.toString(array3));
        */
        
        //78.
        /*int[] array = {5, 7};
        
        if(array[0] == 4 || array[0] == 7 || array[1] == 4 || array[1] == 7)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
        */
        
        //79.
        /*int[] array = {20, 30, 40};
        
        System.out.print("[");
        for(int i=array.length-1; i >= 0; i--)
        {
            System.out.print(array[i] + ",");
        }
        System.out.print("]");
        */
        
        //80.
        /*int[] array = {20, 30, 40};
        
        if(array[0] > array[array.length-1])
        {
            System.out.println(array[0]);
        }
        else
            System.out.println(array[array.length-1]);
        */
        
        //81.
        /*int[] array = {20, 30, 40};
        int[] arrayNew = {array[2], array[1], array[0]};
        
        System.out.println(Arrays.toString(arrayNew));*/
        
        //83.
        /*int[] array1 = {1, 3, -5, 4};                                                  
        int[] array2 = {1, 4, -5, -2};
        
        int multiply1 = array1[0]*array2[0];
        int multiply2 = array1[1]*array2[1];
        int multiply3 = array1[2]*array2[2];
        int multiply4 = array1[3]*array2[3];
        
        System.out.print(multiply1 + ", " + multiply2 + ", " + multiply3 + ", " + multiply4);*/
        
        //84.
        /*String word = "Python";
        String part = word.substring(3, 6);
        
        System.out.println(part + word + part);
        */
        
        //85.
        /*String text = "Hello how are you?";
        if(text.startsWith("Hello"))
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
        */
        
        //86.
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        while(n != 1)
        {
            if(n%2==0)
            {
                n = n/2;
            }
            else
            {
                n = (3*n+1)/2;
            }
        }
        System.out.println("After: " + n);*/
        
        //87.
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            int sum = 0;
            String num = br.readLine();
            char[] numbers = num.toCharArray();
            
            for(int i=0; i<numbers.length; i++)
            {
                sum += numbers[i] - '0';
            }
            System.out.println(sum);
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        */
    
        //88.
        /*System.out.println(System.getenv());
        System.out.println(System.getProperties());
    */
        
        //89.
        /*System.out.println(System.getSecurityManager());*/
    
        //90.
        /*System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv("TEMP"));
        System.out.println(System.getenv("USERNAME"));*/
        
        //91.
        /*System.out.println(System.nanoTime());*/
        
        //92.
        /*int[] nums = {5, 7, 2, 4, 9};
        int countE = 0, countO = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                countE++;
            }
            else
            {
                countO++;
            }
        }
        System.out.println("Even: " + countE + " & odd: " + countO + ".");*/
        
        //93.
        /*int[] nums = {10, 10, 2, 4, 9};
        boolean found10 = false, found20 = false;
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] == 10 && nums[i+1] == 10)
            {
                found10 = true;
            }
            else if(nums[i] == 20 && nums[i+1] == 20)
            {
                found20 = true;
            }
        }
        System.out.println("10: " + found10 + " & 20: " + found20 + ".");
        */
        
        //95.
        /*int n = 5;
        String[] str = new String[n];
        
        for(int i=0; i<n; i++)
        {
            str[i] = String.valueOf(i);
            System.out.println(Arrays.toString(str));
        }*/
        
        //96.
        /*int[] nums = {10, 70, 80, 50, 20, 13, 50};
        boolean testN = false;
        int result = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 10)
            {
                testN = true;
            }
            if(testN == true && nums[i] == 20)
            {
                System.out.println(String.valueOf(true));
                result = 1;
            }
        }
        if(result == 0)
        {
            System.out.println("false");
        }*/
        
        //97.
        /*int[] nums = {10, 20, 10, 50, 60, 13, 50};
        boolean testN = false;
        int sn = 10;
        
        for(int i=0; i<nums.length; i++)
        {
            if(i <= nums.length+1 && nums[i] == sn && nums[i+2] == sn)
            {
                testN = true;
                System.out.println(testN);
            }
        }*/
        
        //98.
        /*int[] nums = {10, 20, 10, 20, 40, 13, 20};
        int count = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 20 && nums[i-1] != 20)
            {
                count++;
            }
            if(count == 3)
            {
                System.out.println(count);
                System.out.println(String.valueOf(true));
            }
        }*/
        
        //101.
        /*int[] nums = {10, 11, 10, 30, 45, 20, 33, 53};
        int count10 = 0;
        int count20 = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 10)
            {
                count10++;
            }
            if(nums[i] == 20)
            {
                count20++;
            }
        }
        
        if(count10 > count20)
            {
                System.out.println(String.valueOf(true));
            }
            else
                System.out.println(String.valueOf(false));
        */
        
        //102.
        /*int[] nums = {11, 11, 13, 31, 45, 20, 33, 53};
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 10 || nums[i] == 30)
            {
                System.out.println(String.valueOf(true));
            }
            else
                System.out.println(String.valueOf(false));
        }*/
        
        //103.
        /*int[] nums = {11, 10, 13, 10, 45, 20, 33, 53};
        int[] nums2;
        
        int l = nums.length - 1;
        
        while(nums[l] != 10)
            l--;
        
        nums2 = new int[nums.length - 1 - l];
        
        for(int i=l+1; i<nums.length; i++)
            nums2[i-l-1] = nums[i];
        
        System.out.println(Arrays.toString(nums2));
        */
        
        //104.
        /*int[] nums = {11, 15, 13, 10, 45, 20, 33, 53};
        int[] nums2;
        
        int l = 0;
        
        while(nums[l] != 10)
            l++;
        
        nums2 = new int[l];
        
        for(int i=0; i<l; i++)
            nums2[i] = nums[i];
        
        System.out.println(Arrays.toString(nums2));
        */
        
        //105.
        /*int[] nums = {11, 15, 13, 10, 45, 20, 11, 15};
        int l = nums[nums.length-1] + nums[nums.length-2];
        int k = nums[0] + nums[1];
        
        if(l == k)
        {
            System.out.println(String.valueOf(true));
        }
        else
            System.out.println(String.valueOf(false));
        */
        
        //106.
        /*int[] nums = {11, 15, 13, 10, 45, 20};
        int[] newNums = new int[nums.length];
        
        for(int i=1; i<nums.length; i++)
        {
            newNums[i-1] = nums[i];
        }
        
        newNums[nums.length-1] = nums[0];
        
        System.out.println(Arrays.toString(newNums));
        */
        
        //107.
        /*int[] nums = {11, 12, 13, 14, 45, 20};
        
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] + 1 == nums[i+1] && nums[i+1] + 1 == nums[i+2])
            {
                System.out.println(String.valueOf(true));
            }
        }*/
        
        //108.
        /*Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0; 
        
        while(num>0)
        {
            sum += num%10;
            num /= 10;
        }
        System.out.println(sum);
        */
        
        //113.
        /*int[] array1 = {1,2,3,4};
        int[] array2 = {2,5,7, 8};
        int[] array3 = new int[array1.length + array2.length];
        
        for(int i=0; i<array1.length; i++)
        {
            for(int j=i; j<array2.length; j++)
            {
                for(int k=j; k<array3.length; k++)
                {
                        array3[k] = array1[i];
                        array3[array3.length-6] = array2[0];
                        array3[3] = array1[2];
                        array3[5] = array2[1];
                        array3[6] = array2[2];
                        array3[array3.length-1] = array2[3];
                }    
            }
        }
        System.out.println(Arrays.toString(array3));
        */
        
        //116.
        /*for(int i=1; i<=100; i++)
        {
            if(i % 3 == 0)
            {
                System.out.println("fizz");
            }
            if(i % 5 == 0)
            {
                System.out.println("buzz");
            }
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("fizz buzz");
            }
        }*/
        
        //117.
        /*Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int sum = (int) Math.sqrt(num);
        
        System.out.println(sum);*/
        
        //118.
        /*String word = "Python";
        String part = "Py";
        
        System.out.println(word.indexOf(part));
        */
        
        //119.
        /*int[] nums = {2, 4, 6, 7, 8};
        int target = 7;
        
        for(int i=0; i<nums.length; i++)
        {
            if(target == nums[i])
            {
                System.out.println(i);
            }
        }*/
        
        //128.
        /*int[] nums = {10,2,22,38,23};
        
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums.length % 2 == 0)
            {
                int mid = nums.length / 2;
                System.out.println((nums[mid] + nums[mid - 1]) / 2);
            }
            System.out.println(nums[nums.length / 2]);
        }*/
        
        //138.
        /*String [] dict = {"cat", "flag", "green", "country", "w3resource"};
        System.out.println("Original dictionary : " + Arrays.toString(dict));
	System.out.println("Longest word(s) of the above dictionary: " + longestWords(dict));
        
    }
}
        public class Solution
        {
            static ArrayList<String> longestWords(String[] dictionary)
            {
                ArrayList<String> list = new ArrayList<String>();
                int longest_length = 0;
                for(String str : dictionary)
                {
                    int length = str.length();
                    if(length > longest_length)
                    {
                        longest_length = length;
                        list.clear();
                    }
                if(length == longest_length)
                {
                    list.add(str);
                }
            }  
            return list;
        }
    }*/
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
