package com.stackroute.java;

import java.util.Scanner;

public class prob9 {
    public static void main(String gopal[]) {
        Scanner s = new Scanner(System.in);
    String str= s.nextLine();
    String reverse="";
    for (int i=str.length()-1; i>=0; i--)
    {
        reverse= reverse+ str.charAt(i);

    }
        System.out.println(reverse);

    }
}
