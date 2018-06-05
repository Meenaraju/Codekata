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
		String s = sc.next();
		String s1 = sc.next();
		try{
			int n = Integer.parseInt(s);
			int n1 = Integer.parseInt(s1);
			if(n<=(2^32) && n1<=(2^32)){
			for(int i=1;i<=3;i++){
			if(n<n1){
				
				int n3 = n1-n;
			            System.out.println(n3);
			}
			}
			}
			
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
