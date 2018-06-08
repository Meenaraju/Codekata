/* package whatever; // don't place package name! */

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
		            String str = (new StringBuilder()).append(s).append(".").toString();	
			System.out.print(str);
			}
		catch(RuntimeException nef){
			System.out.println("invalid");
		}
	}
}
