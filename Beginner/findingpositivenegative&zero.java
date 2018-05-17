import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class integer
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
               Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		try{
		int n = Integer.parseInt(x);	
		if(n>=1 && n<=100000){
			System.out.println("Positive");
		}
		else if(n<=-1){
			System.out.println("Negative");
		}
		else if(n==0){
			System.out.println("Zero");
		}
		else{
			System.out.println("the range exceed");
		}
		}
		catch(NumberFormatException nFE) {
			System.out.println("enter valid no");
		}
	}
}
