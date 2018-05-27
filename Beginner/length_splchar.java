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
		int n=0;
			if(n<=1000){

		    String[] s1 = s.split("[\\!#%^*@&?$+-]+");
		    System.out.println(s1.length);
			}
		else{
			System.out.println("invalid input");
		}
			
	}
}

