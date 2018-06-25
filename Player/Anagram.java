

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s="kabali";
		char[] c= s.toCharArray();
		 Arrays.sort(c);
		String s1 = sc.nextLine();
		int count = 0;
		try{
			int n = Integer.parseInt(s1);
			String[] str = new String[n];
			if(n>=1 && n<=1000){
			for(int i=0;i<n;i++){
				str[i] = sc.nextLine();
			}
			for(int i=0;i<n;i++){
				char[] c1 = str[i].toCharArray();
				Arrays.sort(c1);
				if(Arrays.equals(c,c1)){
					count++;
				}
				else{
					continue;
				}
			}
			System.out.println(count);
			}
			else{
				System.out.println("size exceeds");
			}
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
