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
	     try{
	     	int n = Integer.parseInt(s1);
	            int q = Integer.parseInt(s2);
	            if(n<= 10000 && q<=10000){
	     	for(int i=n+1;i<q;i++){
	     	 if(i%2!=0)
	     	    System.out.print(i+" ");
	     	}
	            }
	            else{
	            	System.out.println("size exceeds");
	            }
	     	}
	     catch(NumberFormatException nef){
	     	System.out.println("invalid input");
	     }
	}
}
