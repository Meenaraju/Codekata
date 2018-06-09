/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	int roman(char r){
		if(r=='I')
                           return 1;
		if(r=='V')
	               return 5;
		if(r=='X')
		  return 10;
		return -1;
	}
	int romantonum(String str){
		int result = 0;
		for(int i=0;i<str.length();i++){
			int c = roman(str.charAt(i)); 
			if(i+1<str.length()){
				int nc = roman(str.charAt(i));
				if(c<=nc){
					result = result+c;
				}
				else{
					result = result+nc-c;
					i++;
				}
			}
			else{
				result = result+c;
				i++;
			}
		}
		return result;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone i = new Ideone();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = i.romantonum(str);
		if(n<=20){
			System.out.print(n);
		}
		else{
			System.out.println("range exceeds");
		}
	}
}
