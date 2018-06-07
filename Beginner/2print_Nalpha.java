/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner cc = new Scanner(System.in);
		            String str = cc.next();
		            String[] s = {"","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		try{
			int i = Integer.parseInt(str);
			 	System.out.print(s[i]);

                                                
		}
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}
	
				
	}
}
