

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
			
			int a = Integer.parseInt(s);
			int sum = 0;
			for(int i=0;i<s.length();i++){
				sum++;
			}
			
			 	System.out.print(sum);
			          
		}
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}
	
				
	}

	}
