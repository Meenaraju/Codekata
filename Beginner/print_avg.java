import java.util.Arrays;
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
	                         int a[] = new int[n];
	                         int sum = 0;
			int i;
		             for(i=0;i<n;i++)
			{
			 
			 a[i] = sc.nextInt();
			 sum = sum + a[i];
			}
			double d = Math.floor(sum/n);
			int k = (int)d;
			System.out.println(k);
			
	
		}
		catch(NumberFormatException nfe){
			System.out.println("invalid");
		}

	}
}
