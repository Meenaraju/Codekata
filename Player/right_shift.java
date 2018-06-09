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
		int temp=0,i,j;
		
		try{
		         	int n = Integer.parseInt(s);
		         	int n1 = Integer.parseInt(s1);
		         	int[] a = new int[n];
		         	for(i=0;i<n;i++){
		         		a[i] = sc.nextInt();
		         	}
		         	for(i=0;i<n1;i++){
		         
		         	 temp = a[n-1];
		         	for(j=n-1;j>0;j--){
		         		a[j] = a[j-1];
		         	}
			a[0] = temp;
		}
			for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
			}
		         	
		         	
		}
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}
	}
}
