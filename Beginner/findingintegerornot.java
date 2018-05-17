import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class integerornot
{
	public static void main (String[] args) throws java.lang.Exception
	{
               Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		try{
			if(n>=1 && n<=100000){

			int n = Integer.parseInt(x);
			if(n%2==0){
				System.out.println("Even");
			}
			else{
				System.out.println("Odd");
			}
			}
			else{
				System.out.println("range exceed");
			}
		}
		catch(NumberFormatException nFE)	{
			System.out.println("enter valid no ");
		}
		
	}
}
	
