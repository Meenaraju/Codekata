

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
			
			int a = Integer.parseInt(s);
			int b = Integer.parseInt(s1);
			int[] c = new int[a];
			for(int i=0;i<a;i++){
				c[i] = sc.nextInt();
			}
			for(int i=0;i<a;i++){
				if(b==c[i]){
					System.out.print("yes");
					break;
					
				}
				else{
					if(i==(a-1)){
					   System.out.print("no");	
					}
					else{
					continue;
					}
				}
			}
			
			 
			          
		}
		catch(NumberFormatException rte){
			System.out.println("invalid");
		}
	
				
	}

	}
