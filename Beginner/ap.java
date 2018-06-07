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
	    String s1 = sc.next();
	    String s2 = sc.next();
	    String s3 = sc.next();
	    try{
	            float n = Float.parseFloat(s1);
	            float a = Float.parseFloat(s2);
	    	float d = Float.parseFloat(s3);
	    	if(n>=1 && d<=100000){
 
	    		float r = (n/2)*((2*a)+(n-1)*d);
	    		int n1 = (int)r;
	    		System.out.println(+n1);
	    	}
	    }
	    catch(NumberFormatException nef){
	    	System.out.println("invalid input");
	    }
	}
}
