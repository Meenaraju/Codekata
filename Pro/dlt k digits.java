/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		String s1 = sc.next();
		try{
			String s = Integer.toString(n1);
			int n = Integer.parseInt(s1);
			System.out.println(s.substring(n,s.length()));
			
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
