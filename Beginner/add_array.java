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
		try{
	              int a[] = new int[2];
		           for(int i=0;i<2;i++)
			{
			 
			 a[i] = sc.nextInt();
			 
			}
			int c,b;
			c = a[0];
			b = a[1];
			int sum = Math.addExact(c,b);
      System.out.println(sum);
			
	
		}
		catch(Exception e){
			System.out.println("invalid");
		}

	}
}
