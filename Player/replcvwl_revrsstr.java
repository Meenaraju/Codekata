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
		String r =" ";
		try{
			String str = s.replaceAll("[aeiouAEIOU]","");
			for(int i=str.length()-1;i>=0;--i){
				r+=str.charAt(i);
			}
			System.out.print(r);
			
		}
		catch(Exception nef){
			System.out.println("invalid");
		}
	}
}
