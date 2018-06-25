import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		StringBuffer s = new StringBuffer(s1);
		char[] c = s1.toCharArray();
		int n=s1.length();
		try{
			if(n>=1 && n<=100000){
			     for(int i=0;i<n;i++){
			     	if(c[i]=='x')
			     	    System.out.print("a");
			     	else if(c[i]=='y')
			     	    System.out.print("b");
			     	else if(c[i]=='z')
			     	    System.out.print("c");
			     	else if(c[i]=='X')
			     	    System.out.print("A");
			           else if(c[i]=='Y')
			     	    System.out.print("B");
			     	else if(c[i]=='Z')
			     	    System.out.print("C");
			     	else
			     	System.out.print((char)(c[i]+3));
			     }
			     
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
