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
		String r = " ";
		try{
			int n = Integer.parseInt(s);
			String str = Integer.toString(n);
			for(int i=str.length()-1;i>=0;--i){
				r += str.charAt(i);
			}
			System.out.println(r);
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
