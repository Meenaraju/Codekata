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
			
			int t = Integer.parseInt(s);
			{
				int d = t / 60; 
        int e = t % 60;
        System.out.printf("%d %02d", d, e);
			}
		}
		catch(NumberFormatException nef){
			System.out.println("invalid input");
		}

	}
}
