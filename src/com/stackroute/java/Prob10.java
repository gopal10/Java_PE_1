package com.stackroute.java;

import java.util.Scanner;

public class Prob10 {
    public static void main(String gopal[]) {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();

        System.out.println("Enter number");
        int num=s.nextInt();
        char sub;
        String res="";
        for(int i=0; i<num; i++)
        {
            for(int j=str.length()-num; j<str.length(); j++)
            {

             sub = str.charAt(j);
              res= res+sub;
            }


        }
        System.out.println(str+res);
    }
}