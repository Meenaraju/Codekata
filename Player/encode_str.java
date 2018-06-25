import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char[] c = s1.toCharArray();
		int n=s1.length();
		try{
			if(n>=1 && n<=100000){
			     for(int i=0;i<n;i++){
			     	c[i] = (char)(c[i]+3);
			     }
			     System.out.print(c);
			}
			else{
				System.out.println("invalid");
			}
		}
		catch(Exception nef){
			System.out.println("invalid");
		}
	}
}
