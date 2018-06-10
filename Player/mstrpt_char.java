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
			char[] a = s.toCharArray();
			int n = s.length()-1;
			char ch =' ';
			int i,max=0;
			if(n>=1 && n<=100000){
	                        while(n>=0){
	                        	int count = 0;
	                        	for(i=0;i<=n;i++){
	                        		if(a[n]==a[i])
	                        		count++;
	                        		
	                        	}
	                        	if(count>max){
	                        		max=count;
	                        		ch = a[n];
	                        	}
	                        	n--;
	                        }
	                        System.out.println(ch);
			}
			else{
				System.out.println("invalid");
			}
                         }
		catch(Exception e){
			System.out.println("invalid");
		}
	
	}
	
		
}
