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
			if(isPowerOf2(n)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
			
		
		}
		catch(NumberFormatException nfe){
			System.out.println("invalid");
		}

	}
	private static boolean isPowerOf2(int n){
		if(n<=0){
			return false;
		}
		else{
			return(n & (n-1))==0;
		}
	}
}
