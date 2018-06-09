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
		String temp = " ";
		try{
			if(s.length()<=10000000){
			for(int i=0;i<s.length();i++){
				if(i%2==0){
				      temp += s.charAt(i+1);
				      
				}
				else{
					temp +=s.charAt(i-1);
				}
				
			}
			System.out.print(temp);
			}
			else{
				System.out.println("size exceeds");
			}
			
		}
		catch(Exception e){
		      System.out.println("invalid");
		}
	}
	
}
