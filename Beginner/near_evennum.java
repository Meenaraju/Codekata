

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
			int n = Integer.parseInt(s);
			if(n%2==0){
			   System.out.println(n);	
			}
			else{
		            System.out.println(--n);
			}
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
