
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String r=" ";
		try{
			String s = sc.nextLine();
			for(int i=s.length()-1;i>=0;--i){
				r +=s.charAt(i);
			}
			System.out.print(r);
		}
		catch(RuntimeException nef){
			System.out.println("invalid");
		}

	}
}
