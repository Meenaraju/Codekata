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
		try{
			int n = Integer.parseInt(s);
			if(n>=1 && n<=10){
				if(n%2==0){
			            int q = n/2;		
				System.out.print(q);
			}
			else{
				System.out.print(n);
			}
			}
			else{
				System.out.println("size exceeds");
			}
		}
				catch(NumberFormatException nef){
			System.out.println("invalid");
		}
			
		
	}
}
