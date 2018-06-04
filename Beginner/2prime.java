
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
	             String s = sc.nextLine();
	     try{
	     	int n = Integer.parseInt(s);
	     	int b=1;
	     	int c= 0;
	     	while(b<=n){
	     		if(n%b==0)
	     		c=c+1;
	     		b++;
	     	}
	     	if(c==2){
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
