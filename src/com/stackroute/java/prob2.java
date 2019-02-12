package com.stackroute.assign;

import java.util.Scanner;

public class prob2 {

	public static void main(String[] args) {
 
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		if(n%2!=0 && n>=20 && n<=30)
		{
			System.out.println("Tom");
		}
		else if(n%2==0 && n>=20 && n<=30)
		{
			System.out.println("jerry");
		}
		
		s.close();
		
	}
}
