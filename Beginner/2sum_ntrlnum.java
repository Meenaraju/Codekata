

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
			if(a<=100000){
			for(int i=0;i<=a;i++){
				sum = sum+i;
			}
			
			 	System.out.print(sum);
			}
			else{
				System.out.println("size exceeds");
			}
                                                
		}
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}
	
				
	}

	}
