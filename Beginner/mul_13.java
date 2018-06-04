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
	            if(n%13==0){
	            	System.out.println("yes");
	            }
	            else{
	            	System.out.println("no");
	            }
	     	
	     }
	     catch(NumberFormatException nef){
	     	System.out.println("invalid input");
	     }
	}

}
