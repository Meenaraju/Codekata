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
			if(s.length()>=1 && s.length()<=100000){
			String str = s.replaceAll("[aeiouAEIOU]","");
			for(int i=str.length()-1;i>=0;--i){
				r+=str.charAt(i);
			}
			System.out.print(r);
			}
			else{
				System.out.print("invalid");
			}
			
		}
		catch(Exception nef){
			System.out.println("invalid");
		}
	}
}
