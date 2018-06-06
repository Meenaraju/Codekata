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
	     String str = sc.nextLine();
	     String[] a = str.split("");
	     List<String> l = Arrays.asList(a);
	     Set<String> s = new HashSet(l);
	     if(str.length()<=1000){
	     if(str.length()==s.size()){
	     	System.out.println("Yes");
	     }
	     else{
	     	System.out.println("No");
	     }
	     }
	     else{
	     	System.out.println("invalid");
	     }
	     	
	     
		}
		catch(RuntimeException rte){
			System.out.println("invalid");
		}

	}
}
