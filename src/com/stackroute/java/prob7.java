package com.stackroute.java;

import java.util.Scanner;

public class prob7 {
    public  static  void main(String gopal [])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = s.nextInt();

        int [] a= new int[size];


        for(int i=0; i <a.length; i++)
        {
            System.out.println("Enter the value of element "+ i);
            a[i]=s.nextInt();

        }

        for(int i=0; i<a.length-1; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]<a[j])
                {
                    int temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }

        System.out.print("Sorting in Descending order");
        for(int i=0; i <a.length; i++)
        {
            System.out.print(a[i]+" ");
        }

        int sum= evensum(a);
        System.out.println("\nSum of even numbers is "+sum);

        if (sum>15)
        {
            System.out.println("True");
        }
        else
            System.out.println("False");

    }

    public  static  int evensum(int a [])
    {
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2==0)
            {
                sum = sum+a[i];
            }

        }
        return sum;
    }

}
