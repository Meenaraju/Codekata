

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
		String a = ".*[A-z].*";
		String n = ".*[0-9].*";
		try{
			if(s.length()<=1000){
			if(s.matches(a) && s.matches(n)){
			   System.out.println("Yes");	
			}
			else{
		            System.out.println("No");
			}
			}
			else{
				System.out.println("size exceeds");
			}
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
