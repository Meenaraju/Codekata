/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
          Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          try{
          	int n = Integer.parseInt(s);
          	if(n<=1000){
          	System.out.println(nextpow(n));
          	}
          	else{
          		System.out.println("size exceeds");
          	}
          }
          catch(NumberFormatException nef){
          	System.out.println("invalid");
          }
	}
	public static int nextpow(int n){
		int count=0;
		while(n!=0){
			n >>=1;
			count+=1;
		}
		            return 1 << count;	
		
		
	}
}
