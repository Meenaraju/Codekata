/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
	     String s = sc.next();
	     String s1 = sc.next();
	     try{
	     	int gcd=1;
	     	int n = Integer.parseInt(s);
	     	int n1 = Integer.parseInt(s1);
	           	for(int i=1;i<=n && i<=n1;i++){
	           		if(n%i==0 && n1%i==0){
	           			gcd = i;
	           		}
	           	}
	       System.out.println(gcd);
	 
	     	
	     }
		
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}

	}
}
