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
			int count=0;
			if(n<=100000 && n1<=100000){
				
			for(int i=n;i<=n1;i++){
				int c=0;
			for(int j=2;j<i;j++)
			if(i%j==0)
			c++;
		        if(c==0)
		          count++;
			 
                      			}
                      		System.out.print(count);
			}
			else{
				System.out.println("size exceeds");
			}
		}
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}
	}
}
