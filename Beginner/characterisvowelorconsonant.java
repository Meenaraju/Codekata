import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class vowelornot
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
	            	char ch=sc.next( ).charAt(0);	 
	
	    	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='i'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
	    		System.out.println("vowels");
	    	}
	    	else {
	    	if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	    		System.out.println("consonant");
	    	
	    
		else
			System.out.println("enter the correct value");
	    	}		
	
	}
}
