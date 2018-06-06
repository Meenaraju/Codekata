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
			int sum = 0;
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				sum = sum+a[i];
			}
			System.out.println(sum);
		
		}
			catch(NumberFormatException e){
			System.out.println("invalid");
		}
	
	}
}
