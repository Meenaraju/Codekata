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
	    	int result = 1;
	    	for(int i=1;i<=n;i++){
	    		 
	    		  result = result*i;
	    	}
	    	System.out.println(+result);
	    }
	 catch(NumberFormatException nef){
	    	System.out.println("invalid input ");
	    }
	}
}
