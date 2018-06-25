

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int count = 0;
		try{
			int n = Integer.parseInt(s1);
			if(n>=2 && n<=100000){
			for(int i=2;i<=n;i++){
				if(n%i==0){
				   for(int j=2;j<i;j++){
				   	if(i%j==0){
				   		count++;
				   	}
				  	else{
				  		continue;
				  	}
				   }
				   if(count==0){
				   	System.out.print(i+" ");
				   }
				}
			       }
			       
			       
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
