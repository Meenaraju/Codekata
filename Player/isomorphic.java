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
		String t = sc.next();
		if(s.length()<=100000 && t.length()<=100000){
			
			System.out.print(isomorphic(s,t));
			
		}
		else{
			System.out.println("size exceeds");
		}
	}
	public static boolean isomorphic(String s,String t){
		if(s.length()!=t.length()){
		     return false;
		}
		  if(s.length()==1){
		  	 return true;
		  }
		  if(s.length()==t.length()){
		  	int n;
		  	int n1;
		  	for(int i=0;i<s.length()-1;i++){
		  		n = s.charAt(i);
		  		n1 = s.charAt(i+1);
		  		if(n==n1){
		  		n = t.charAt(i);
		  		n1=t.charAt(i+1);
		  		if(n==n1){
		  			continue;
		  		}
		  		else{
		  			 return false;
		  		}
		  	}
		  	else if(n!=n1){
		  		n = t.charAt(i);
		  		n1 = t.charAt(i+1);
		  		if(n!=n1){
		  			continue;
		  		}
		  		else{
		  			 return false;
		  		}
		  	}
		}
		  }
		  return true;
		  
	}
	
}
