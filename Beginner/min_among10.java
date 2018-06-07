

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
			
			int[] a = new int[10];
			for(int i=0;i<10;i++){
				a[i] = sc.nextInt();
			}
			int min = a[0];
			for(int i=0;i<10;i++){
				if(min>a[i]){
					min = a[i];
				}
			}
			 	System.out.print(min);
			
                                                
		}
		catch(RuntimeException rte){
			System.out.println("invalid");
		}
	
				
	}

	}
