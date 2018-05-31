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
		String s1 = sc.next();
		String s2 = sc.next();
		try{
	              int N,K,result=0;
	              N = Integer.parseInt(s1);
                          K= Integer.parseInt(s2);
		
		for(int i=0;i<=K;i++){
			result = result+i;
		}	
		System.out.println(+result);	
		
		
		}
		catch(NumberFormatException nfe){
			System.out.println("enter the correct input");
		}
	}
}
