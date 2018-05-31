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
		for(int i=0;i<n;i++){
			System.out.println("Hello");
		}
		}
		catch(NumberFormatException nfe){
			System.out.println("enter the correct input");
		}
	}
}
