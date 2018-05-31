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
		int n = sc.nextInt();
			if(n<=10000000){
			int i=0;
		            while(n!=0)
			{
			 n = ++n;
			 break;
			}
			System.out.println(n);
			
			}
		
		
		else{
			System.out.println("invalid input");
		}

	}
}
