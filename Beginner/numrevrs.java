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
		int a = 0;
		int x=0;
		try{
			int n = Integer.parseInt(s);
			while(n!=0){
				a=n%10;
				x=x*10+a;
				n=n/10;
			
			}
		       System.out.println(x);	
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
