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
		            String s = sc.nextLine();
			 String[] r =s.trim().split(" ");
			 for(int i=0;i<r.length;i++){
			 	System.out.print(r[i].toUpperCase().charAt(0) + r[i].substring(1) + " ");

                                                }
		}
		catch(RuntimeException rte){
			System.out.println("invalid");
		}
	
				
	}
}
