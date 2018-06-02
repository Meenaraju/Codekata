

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
			int sum = 0;
			int count = 0;
			while(n!=0){
				sum = n%10;
				count = count+sum;
				n = n/10;
				
			}
		            System.out.println(count);	
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
