

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
		String s1 = sc.next();
		String d =" ";
		try{
			int n = Integer.parseInt(s1);
		           for(int i=0;i<n && i<s.length();i++){
		             d+= s.charAt(i);
		           	
		           }
		           System.out.println(d);
		}
		catch(NumberFormatException e){
			System.out.println("invalid");
		}
	}
}
