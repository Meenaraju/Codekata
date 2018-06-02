

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
	    int n = 1;
	    try{
	    	if(n<=10000){
	    		String[] s1 = s.split("\\s+");
	    		System.out.println(s1.length);
	    	}
	    	
	    }
	    catch(Exception e){
	    	System.out.println("invalid");
	    }
	}
}
