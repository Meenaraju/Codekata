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
		String s = sc.nextLine();
		try{
			long n = Long.parseLong(s);
			long n1 = 0;
			long n2 = 1;
			if(n<=100000000000L){
			while(n!=0){
				n1 = n%10;
				n2 = n2*n1;
				n = n/10;
			}
			System.out.print(n2);
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
