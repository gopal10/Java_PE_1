package com.stackroute.assign;
import java.util.*;
public class Prob1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		long num= s.nextLong();
		
	     boolean res = ispali(num);
	     
	     boolean sum= addnum(num);
	     
	     if(sum && res)
	     {
	    	 System.out.println(num +" is Number is palindrome and even sum is greater than 25");
	     }
	     else if(res && !sum)
	     {
	    	 System.out.println(num +" is Number is palindrome and even sum is less than 25"); 
	     }
	     else
	     {
	    	 System.out.println(num +" is Number is Not palindrome");
	     }
	     s.close();
	}
	


	static boolean ispali(long x)
	{
		long sum=0,res=0,temp=x;
		for(long i=x; i!=0 ;)
		{
		   sum=i%10;
		   res=res*10 + sum;
		 
		   i=i/10;
		   
		}
		if(temp==res)
		{
		return true;
		}
		else
			return false;
		
	}

	static boolean addnum(long x)
	{
		long sum=0,add=0;
		for(long i=x; i!=0 ;)
		{
		   sum=i%10;
		  if(sum%2==0)
		  add=add+sum;
		  
		   i=i/10;
		   
		}
		if(add>25)
			return true;
			else
		return false;
		
	}
}
