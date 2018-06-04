

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
                        Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				count++;
				continue;
			
		}
		if(count>0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		
		
	}
}
