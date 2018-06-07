

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
		            String s2 = sc.next();
		try{
			
			int a = Integer.parseInt(s);
			int b = Integer.parseInt(s1);
			int c = Integer.parseInt(s2);
			int d = c-1;
			float p = (c/2f)*(2*a+(d*b));
			int ap = (int)p;
			 	System.out.print(ap);
			
                                                
		}
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}
	
				
	}

	}
