/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s = sc.next();
		try{
			int n = Integer.parseInt(s);
			System.out.println(s1.substring(n,s1.length()));
			
			
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
