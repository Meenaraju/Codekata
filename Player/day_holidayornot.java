/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		try{
		         String s1 = sc.nextLine();	
			switch(s1){
				case "Monday":
					System.out.print("no");
					break;
				case "Tuesday":
					System.out.print("no");
					break;
				case "Wednesday":
					System.out.print("no");
					break;
				case "Thursday":
					System.out.print("no");
					break;
				case "Friday":
					System.out.print("no");
					break;
				case "Saturday":
					System.out.print("yes");
					break;
				case "Sunday":
					System.out.print("yes");
					break;
				default:
				            System.out.print("invalid");
			}
		}
		catch(Exception rte){
			System.out.println("invalid");
		}
	}
}
