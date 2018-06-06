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
		try{
			int n = Integer.parseInt(s);
			int i =0;
			int total = (n+1)*(n+2)/2;
			int[] a = new int[n];
			for(i=0;i<n;i++){
				a[i] = sc.nextInt();
			            total -=a[i];
			}
			System.out.println(total);
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
