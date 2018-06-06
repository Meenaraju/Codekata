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
			double n3 = n2/100.0;
			double n4 = n*n1*n3;
			double d = Math.floor(n4);
			int i = (int)d;
			System.out.println(i);
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
