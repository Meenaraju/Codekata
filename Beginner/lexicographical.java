

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
		char[] c = s.toCharArray();
		Arrays.sort(c);
		System.out.println(new String(c));
		}
			catch(RuntimeException e){
			System.out.println("invalid");
		}
	
	}
}
