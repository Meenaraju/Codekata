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
		String s = sc.nextLine();
                         try{
			int n = Integer.parseInt(s);
			int[] a = new int[n];
			int i,flag=0;
			if(n>=1 && n<=100000){
			for(i=0;i<n;i++){
				a[i] = sc.nextInt();
			}
			for(i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(i!=j){
						if(a[i]!=a[j]){
							flag = 1;
						}
						else{
							flag=0;
							break;
						}
					}
				}
				if(flag==1){
					System.out.println(a[i]);
				}
			}
			}
			else{
				System.out.println("exceeds");
			}
			}
		catch(NumberFormatException nfe){
			System.out.println("invalid");
		}
	
	}
	
		
}
