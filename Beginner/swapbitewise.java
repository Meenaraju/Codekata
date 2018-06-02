

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
		int h =1;
		try{
			int n = Integer.parseInt(s);
			int n1 = Integer.parseInt(s1);
			
			if(h<=100000){
				
				n = n^n1;
				n1= n^n1;
			            n = n^n1;
			            System.out.print(n+" "+n1);
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
