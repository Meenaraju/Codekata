/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
	     Scanner sc = new Scanner(System.in);
	     String a = sc.nextLine();
	     String b= a.replaceAll("\\s+","");
	     String[] div = b.split("[%/]");
	     int d1 =Integer.parseInt(div[0]);
	     int d2 = Integer.parseInt(div[1]);
	     if(b.contains("/")){
	     int d3 = d1/d2;
	     System.out.println(d3);
	     }
	     else{
	     	int d4 = d1%d2;
	     	System.out.println(d4);
	     }
		}
		catch(RuntimeException rte){
			System.out.println("invalid");
		}
	
	}
}
