

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
		        double n = Double.parseDouble(s);
			double d = Math.ceil(n);
			int c = (int)d;
			System.out.println(c);
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
		
	}
}
