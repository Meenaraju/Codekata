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
		String s1 = sc.next();
		int temp;
		try{
			
			int n = Integer.parseInt(s);
			int n1 = Integer.parseInt(s1);
			temp = n;
			n = n1;
	    n1 = temp;
		  System.out.println(n+" "+n1);
			
		}
		catch(NumberFormatException nef){
			System.out.println("invalid input");
		}			
	}
}
