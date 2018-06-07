

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
		try{
			int n = Integer.parseInt(s1);
			if(s.length()>n){
				System.out.print(s.substring(s.length()-n));
			}
		}
				catch(NumberFormatException nef){
			System.out.println("invalid");
		}
			
		
	}
}
