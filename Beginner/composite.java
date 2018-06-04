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
	     	if(n<=10000){
	     	int b=1;
	     	int c=0;
	     	while(b<=n){
	     		if(n%b==0)
	     			c=c+1;
	     			b++;
	     		
	     	}
	     	if(c==2)
	     	   System.out.println("no");
	     	else
	     	   System.out.println("yes");
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
