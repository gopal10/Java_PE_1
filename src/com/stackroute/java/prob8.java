package com.stackroute.java;

import java.util.Scanner;

public class prob8 {
    public static void main(String gopal[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int lower= s.nextInt();
        System.out.println("Enter the higher limit");
        int higher=s.nextInt();


       while(true)
       {
           System.out.println("Guess the number");
           int num=s.nextInt();

           if(num>lower && num<higher)
           {
               System.out.println("Congratulations Your Guess is correct");
               break;
           }
           else if(num>higher)
           {
               System.out.println("Guess is Higher than your prediction");
               continue;
           }
           else
           {
               System.out.println("Guess is lower than your prediction");
               continue;
           }

       }

    }
}
