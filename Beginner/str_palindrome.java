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
          String r = "";
          try{
          	for(int i=s.length()-1;i>=0;i--){
          	        r += s.charAt(i);
          	        
          	}
          	if(s.equals(r)){
          	System.out.println("yes");
          	}
          	else{
          		System.out.println("no");
          	}
          }
          catch(Exception nef){
          	System.out.println("invalid");
          }
		
		
	}
}
