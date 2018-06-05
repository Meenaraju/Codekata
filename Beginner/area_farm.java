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
	       	double n = Double.parseDouble(s);
	       	double n1 = Double.parseDouble(s1);
	       	double n2 = n*n1;
	       	System.out.printf("%.5f%n",n2);
	       	
	       }
	       catch(NumberFormatException nef){
	       	System.out.println("invalid");
	       }
	}
}
