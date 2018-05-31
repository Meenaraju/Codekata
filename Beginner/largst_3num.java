import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String s1,s2,s3;
		Scanner sc = new Scanner(System.in);
		 s1 = sc.nextLine();
		 s2 = sc.nextLine();
		 s3 = sc.nextLine();
		try{
		   int a = Integer.parseInt(s1);
		   int b = Integer.parseInt(s2);
		   int c = Integer.parseInt(s3);
		
		if(a>=b && a>=c){
			System.out.println(+a);
			
		}
		else if(b>=a && b>=c){
			System.out.println(+b);
		}
		else{
			System.out.println(+c);
		}
		}
		catch(NumberFormatException nfe){
			System.out.println("enter the correct value ");
		}	
	
	}
}
