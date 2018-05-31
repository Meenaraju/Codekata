import java.util.Arrays;
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
			if((n%400==0) || ((n%4==0) && (n%100!=0))){
				System.out.println("yes");
				
			}
			else{
				System.out.println();
			}
		}
		catch(NumberFormatException nfe){
			System.out.println("enter the correct input");
		}
	}
}
