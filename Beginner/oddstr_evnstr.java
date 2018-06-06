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
	     String g=" ";
	     String h=" ";
	     String a = sc.nextLine();
	     for(int i=0;i<a.length();i++){
	     	if(i%2==0){
	     		 g += a.charAt(i);
	     	}
	     	else{
	     		 h += a.charAt(i);
	     	}
	     	
	     }
	     System.out.print(g+" "+h);
		}
		catch(RuntimeException rte){
			System.out.println("invalid");
		}
	}
}
