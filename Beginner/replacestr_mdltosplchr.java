

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
		        int n = s.length();
		        double d = Math.ceil(n/2);
		        int c = (int)d;
		        char[] s1 = s.toCharArray();
                                 s1[c] = '*';
                                 s = String.valueOf(s1);
                                 System.out.println(s);
		}
		catch(Exception nef){
			System.out.println("invalid");
		}
		
	}
}
