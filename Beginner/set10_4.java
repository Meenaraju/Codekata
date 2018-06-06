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
		String s1 = sc.next();
		try{
			int n = Integer.parseInt(s);
			int n1 = Integer.parseInt(s1);
			int[] a = new int[n];
			for(int i=1;i<=n;i++){
				a[i] = sc.nextInt();
				if(i==n1){
			System.out.println(a[i]);
			break;
				}
				else{
					continue;
				}
			}
		}
			catch(NumberFormatException e){
			System.out.println("invalid");
		}
	
	}
}
