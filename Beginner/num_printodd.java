import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
	     String s = sc.next();
	     try{
	     	int n = Integer.parseInt(s);
	     	if(n<=100000){
	     	char[] a = String.valueOf(n).toCharArray();
	     	for(int i=0;i<s.length();i++){
	     		if(a[i]%2!=0){
	     		             System.out.print(a[i]+" ");
	     		}
	     		continue;
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
