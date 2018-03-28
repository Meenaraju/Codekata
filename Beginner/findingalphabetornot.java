import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class alphaornot
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println("Alphabet");
			
		}
		else{
			System.out.println("no");
		}
	}
}
