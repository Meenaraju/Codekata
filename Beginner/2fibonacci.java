

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
			int n = Integer.parseInt(s);
			int a=0,b=0,c=1;
		           for(int i=0;i<n;i++){
		            b = c+a;
		            System.out.print(b+" ");
		            c = a;
		            a = b;
		           }
		}
		catch(NumberFormatException e){
			System.out.println("invalid");
		}
	}
}
