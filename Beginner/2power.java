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
			int n = Integer.parseInt(s);
			int n1 = Integer.parseInt(s1);
			 double n3 = Math.pow(n,n1);
			 int d=(int)n3;
			 	System.out.print(d);

                                                
		}
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}
	
				
	}
}
