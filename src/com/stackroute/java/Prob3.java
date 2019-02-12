package com.stackroute.assign;
import java.util.*;

public class Prob3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		String set= s.nextLine();
		
		for(int x=0; x<set.length(); x++)
		{
			char ch= set.charAt(x);
			if(ch<64)
			{
				System.out.println("error");
				break;
			}
			else
			{
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'|| ch=='A'|| ch=='E'||
					ch=='I'|| ch=='O' || ch=='U')
			{
				System.out.print(ch+" is Vowel ");
			}
	
			else
			{
				System.out.print(ch +" Consonent ");
			}
			}	
			
			
		}
		 
	}
	}

