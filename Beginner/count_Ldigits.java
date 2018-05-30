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
		long n = sc.nextLong();
			if(n<=100000000000L){
			long i=0;
		            while(n!=0)
			{
			 n = n/10;
			 ++i;
			}
			System.out.println(i);
			}
		
		
		else{
			System.out.println("invalid input");
		}

	}
}
