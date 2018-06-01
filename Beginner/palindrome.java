import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		try{
			int N = Integer.parseInt(s1);
			
			if(N<=10000){
				
			  int temp=N;
			  int K;
			  int reverse=0;
			 while(N!=0){	
			   
			  K= N%10;
			  reverse = reverse * 10 + K;
                                       N /= 10;
			 
			 }
			if(temp==reverse)
			System.out.println("yes");
			}
			else{
			 System.out.println("no");	
			}
		}
		catch(NumberFormatException nef){
			System.out.println("invalid input");
		}
             }
}
