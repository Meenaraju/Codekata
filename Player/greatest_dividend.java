import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();
		int count=0;
            	try{
		int n = Integer.parseInt(s);
		int k = Integer.parseInt(s1);
		if(n<=100000 && k<=100000){
			for(int i=1;i<=n;i++){
				if(n%i==0 && k%i==0){
					if(count<i){
					count=i;
					}
				}
			}
			System.out.print(count);
		}	
		else{
			System.out.print("size exceeds");
		
		}
		}
		catch(NumberFormatException nef){
			System.out.print("invalid");
			
		}
	}
}
