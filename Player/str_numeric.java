import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(!s.isEmpty()){
            	try{
		int n = Integer.parseInt(s);
		System.out.print("yes");
            	}
		catch(NumberFormatException nef){
			System.out.print("no");
			
		}
            	}
            	else{
            		System.out.print("empty");
            	}
	
            	
	}
}
