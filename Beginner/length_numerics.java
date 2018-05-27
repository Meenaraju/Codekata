

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
		int n=1;
			if(n<=1000){
		    System.out.println(s.replaceAll("\\D","").length());
			}
		else{
			System.out.println("invalid input");
		}
			
	}
}
