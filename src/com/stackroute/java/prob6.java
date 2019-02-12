package com.stackroute.java;

import java.util.Scanner;

public class prob6 {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);

        if(ch>='a' && ch<='z')
        {
            System.out.println("Small case Letter");
        }
        else if(ch >='A' && ch <='Z')
                System.out.println("Capital letter");
        else if(ch >='0' && ch<='9')
            System.out.println("Number");
        else
            System.out.println("Special charachter");


    }
}
