/* package whatever; // don't place package name! */

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
		            String[] s1 = {"","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		try{
			int n = Integer.parseInt(s);
			 	System.out.print(s1[n]);

                                                
		}
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}
	
				
	}
}
