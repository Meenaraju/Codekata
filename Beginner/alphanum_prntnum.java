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
		String str = s.replaceAll("[^0-9.]","");
		System.out.println(str);
		}
			catch(RuntimeException e){
			System.out.println("invalid");
		}
	
	}
}
