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
		            String s2 = sc.next();
		try{
			
			int n = Integer.parseInt(s);
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			if(n<=1000 && n1<=1000 && n2<=1000){
			int n3 = (n*n1)/n2;
			 	System.out.print(n3);
			}
			else{
				System.out.println("size exceeds");
			}
                                                
		}
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}
	
				
	}
}
