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
	           if(n <= 100000 && q<=100000){
	     	for(int i=n+1;i<q;i++){
	     		 int c=0;
	               for(int j=2;j<i;j++)	
	               if(i%j==0)
	               c++;
	     	 if(c==0)
	     	   System.out.print(i+" ");
	     	    
	     	}
	           }
	           else{
	           	System.out.println("size exceds");
	           }
	     }
	     catch(NumberFormatException nef){
	     	System.out.println("invalid input");
	     }
	}
}
