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
			if(n>=1 && n<=1000)
			{
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
		}
		else{
			System.out.println("the range exceed");
		}
			
			
		}
		catch(NumberFormatException nef){
			System.out.println("invalid input");
		}

	}
}
