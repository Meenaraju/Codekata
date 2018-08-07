
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner sc = new Scanner(System.in);
	String s= sc.next();
	String s1 = sc.next();
	try{
		int n = Integer.parseInt(s);
		int n1 = Integer.parseInt(s1);
		int[] a = new int[n];
		if(n>=1 && n<=1000000000000000L){
		int count =0;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]==n1){
				count++;
				break;
			}
		}
		if(count==1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
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
