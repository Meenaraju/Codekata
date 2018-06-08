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
		int fact = 1;
		try{
			int n = Integer.parseInt(s);
			if(n<=20){
				for(int i=1;i<=n;i++){
				   fact = fact*i;
				}
				System.out.print(fact);
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
