import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		try{
			long n = Long.parseLong(s);
			long h = 0;
			long sqr = 0;
			if(n>=1 && n<=1000000000000000000L){
				while(n!=0){
					h = n%10;
					sqr = sqr+(h*h);
					n = n/10;
				}
			System.out.println(sqr);	
			}
			else{
			System.out.println("size exceeds");
			}
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
