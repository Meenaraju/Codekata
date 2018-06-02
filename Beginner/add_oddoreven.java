

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
	    	int n2 = n+n1;
	    	if(n2%2==0){
	    		System.out.println("even");
	    	}
	    	else{
	    		System.out.println("odd");
	    	}
	    }
	    catch(NumberFormatException e){
	    	System.out.println("invalid");
	    }
	}
}
