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
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			            System.out.println(a[i]+" "+i);
			
			}
		}
		catch(NumberFormatException nef){
			System.out.println("invalid input");
		}

	}
}
