import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try{
			int n = Integer.parseInt(s);
			if(n>=1 && n<=100000){
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			{
		                   a[i]=sc.nextInt();
			}
			int min = a[0];
			for(int i=0;i<n;i++){
				if(a[i]<min)
				{
				min = a[i];
				}
			}
			System.out.print(min);
		
			}
			else{
				System.out.println("size exceeds");
			}
		}
	    catch(NumberFormatException nef){
	    	System.out.println("invalid input");
	    }
	}
}
