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
			String s = sc.nextLine();
			String s1 = s.toLowerCase();
			String[] str = s1.trim().split(" ");
			if(s.length()<=1000000){
			for(int i=0;i<str.length;i++){
				System.out.print(str[i].toUpperCase().charAt(0)+str[i].substring(1)+" ");
			}
			}
			else{
				System.out.println("size exceeds");
			}
		}
		catch(RuntimeException rte){
			System.out.println("invalid");
		}
	}
}
