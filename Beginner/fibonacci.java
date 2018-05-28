

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
			int a = 0,b = 1,c = 0;
			System.out.print(b);
			for(int i=0;i<n-1;i++){
			           c = a + b;
	
			System.out.print(" "+c);
			a = b;
			b = c;
			}	
		}
		catch(NumberFormatException nef){
			System.out.println("invalid input");
		}	
			
			
	}
}
