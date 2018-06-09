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
		String s = sc.next();
		String s1 = sc.next();
		try{
			int diff=0;
			if(s.length()<=100000){
			if(s.length()!=s1.length()){
				System.out.print("length differ");
			}
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)!=s1.charAt(i)){
				if(++diff>1){
				System.out.print("no");
				break;
				}
				}
			
			        }
				if(diff<=1){
					System.out.print("yes");
				}
			}
			else{
				System.out.println("size exceeds");
			}
			
		}
		catch(Exception rte){
			System.out.println("invalid");
		}
	}
}
