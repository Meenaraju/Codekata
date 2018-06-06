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
			int n3 = (2*n*n1)+(2*n*n2)+(2*n1*n2);
			int n4 = n*n1*n2;
			System.out.println(n4);
		
		}
			catch(NumberFormatException e){
			System.out.println("invalid");
		}
	
	}
}
