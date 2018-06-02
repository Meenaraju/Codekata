

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n[] = new int[10];
		try{
			for(int i=0;i<10;i++){
				n[i] = sc.nextInt();
			}
			int max = n[0];
			for(int i=0;i<10;i++){
				if(max<n[i]){
					max = n[i];
				}
			}
		System.out.println(max)	;
		}
		catch(Exception e){
			System.out.println("invalid");
		}
	}
}
