import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		try{
			if(s.length()<10000000){
				for(int i=0;i<c.length;i++){
			if(Character.isUpperCase(c[i])){
				System.out.print(Character.toLowerCase(c[i]));
			}
			else{
				System.out.print(Character.toUpperCase(c[i]));
			}
			}
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
