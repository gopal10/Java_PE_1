package com.stackroute.assign;
import java.util.*;

public class prob4 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(" " +i);
			}
		}
	}
}
