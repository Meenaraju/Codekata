
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
		int count=0;
		try{
			long n = Long.parseLong(s);
			int k = Integer.parseInt(s1);
			String str = Long.toString(n);
			if(str.length()>=1 && str.length()<=100000){   
				if(k>=0 && k<=9){
			char b = (char)(k+'0');
			char[] ch = str.toCharArray();
			for(int i=0;i<ch.length;i++){
				if(ch[i]==b){
					count++;
				}
			}
			
				}
				
			}
		System.out.print(count);	
		}
		catch(NumberFormatException nef){
			System.out.print("invalid");
		}
	}
}
