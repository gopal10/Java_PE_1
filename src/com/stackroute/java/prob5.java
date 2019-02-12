package com.stackroute.java;

import java.util.Scanner;

public class prob5 {
    public static void main(String gopal[]) {
        Scanner s = new Scanner(System.in);
        String s1= s.nextLine();

        String [] s2= s1.split(" ");
int sum=0;
        int ar[]= new int [s1.length()];
        for (int i=0; i<s2.length; i++)
        {
            ar[i]=Integer.parseInt(s2[i].trim());
            sum=sum+ar[i];
        }
        System.out.println(sum);



    }
}