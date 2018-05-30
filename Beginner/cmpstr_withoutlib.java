import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();
		int n=0;
		if(n<=1000){
		int cmp = 0;
			for(int i=0;i<s.length() && i<s1.length();i++){
			           int a = s.charAt(i);
			           int b = s1.charAt(i);
			           if(a<b){
			           	cmp = -1;
			           	break;
			           }
			           else if(a>b){
			           	cmp = 1;
			           	break;
			           }
			          
			}
			System.out.println(s1);
		}
		else{
			System.out.println("invalid input");
		}
		 
	}
}
