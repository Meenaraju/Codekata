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
			int i;
			int max;
			if(n>=1 && n1<=100000){
				for( i=1;i<=100000;i++){
					if(i%n==0 && i%n1==0){
						System.out.println(i);
						break;
					}
					
				}
			}
			else{
				System.out.println("exceeds");
			}		
		
			}
		catch(NumberFormatException nfe){
			System.out.println("invalid");
		}
	
	}
	
		
}
