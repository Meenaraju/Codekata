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
		int reverse = 0;
		int sum = 0;
		try{
			int n = Integer.parseInt(s);
			while(n!=0){
				sum = n%10;
				reverse = reverse*10+sum;
				n = n/10;
			}
			System.out.print(reverse);
			}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
