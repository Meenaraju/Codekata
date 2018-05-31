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
			if(n<=10000){
	                         int a[] = new int[n];
			int i;
		             for(i=0;i<n;i++)
			{
			 
			 a[i] = sc.nextInt();
			}
			int low = a[0];
			int high = a[0];
			for(i=0;i<n;i++){
				if(high<a[i]){
					high = a[i];
				}
				if(low>a[i]){
					low = a[i];
				}
			}
		
		System.out.print(low+" "+high);	
			}
		else{
			System.out.println("size exceeds");
		}
		
		}
		catch(NumberFormatException nfe){
			System.out.println("invalid");
		}

	}
}
			
			
