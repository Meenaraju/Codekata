import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    try{
	    	int n = Integer.parseInt(s);
	    	for(int i=1;i<=5;i++){
	    		 
	    		 int result = n*i;
	    		  System.out.print(result+" ");
	    	}
	    	
	    }
	 catch(NumberFormatException nef){
	    	System.out.println("invalid input ");
	    }
	}
}
