

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
			
			int a = Integer.parseInt(s);
			int b = Integer.parseInt(s1);
			System.out.print(a+""+b);
		}
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}
	
				
	}

	}
