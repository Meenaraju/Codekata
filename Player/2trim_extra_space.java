import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try{
			if(s.length()<1000000){
			System.out.print(s.replaceAll(" ",""));
			}
			else{
				System.out.println("size exceed");
			}
		
		}
		catch(Exception nef){
		              System.out.print("invalid");	
		}
		
	}
}
