package week1.assignments;

import java.util.Iterator;

public class IsPrime {
	 
	public static void main(String[] args) 
	{
		int n=53;
		boolean num=false;
		for (int i = 2; i < n; i++) {
			
			if(n%i==0)
			{
				num= true;
				break;
			
			}
			
		}
if(num)

	{
	System.out.println(n +" is not a prime number");
	}
else {
	System.out.println(n +" is prime number");
}
	
		
	}
}
