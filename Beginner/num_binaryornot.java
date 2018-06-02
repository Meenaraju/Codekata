

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
	    	int n = Integer.parseInt(s);
	    	int c=0;
	    	int r=0;
	    	int temp = n;
	    	while(n>0){
	    	if(n%10==1 || n%10==0)
	    		c++;
	    		r++;
	    		n=n/10;
	    	
	    	}
	    	if(c==r){
	    		System.out.println("yes");
	    	}
	    	else{
	    		System.out.println("no");
	    	}
	    }
	    catch(NumberFormatException nef){
	    	System.out.println("invalid");
	    }
	}
}
