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
	     	int b=1;
	     	int c=0;
	     	if(n<=1000){
	     	while(b<=n){
	     		if(n%b==0)
	     			System.out.print(b+" ");
	     			b++;
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
