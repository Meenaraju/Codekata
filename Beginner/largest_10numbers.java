

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
			for(int i=0;i<10;i++)
			{
				a[i]=sc.nextInt();
			}
			int max = a[0];
			for(int i=0;i<10;i++){
				if(a[i]>max)
				{
				max = a[i];
				}
			}
			System.out.println(max);
		
			
	}
}


				
