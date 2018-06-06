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
		String s = sc.nextLine();
		try{
			int n = Integer.parseInt(s);
			int k = n+273;
			System.out.println(k);
		
		}
			catch(NumberFormatException e){
			System.out.println("invalid");
		}
	
	}
}
