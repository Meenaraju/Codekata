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
			int n1 = Integer.parseInt(s1);
			if(n<=100000 && n1<=100000){
				for(int i=1;i<=n1/2;i++){
					int c = i*i;
			    if(c>=n && c<=n1)
			    count++;
			}
			System.out.print(count);
			}
			
			else{
				System.out.println("size exceed");
			}
		
		}
		catch(NumberFormatException nef){
		              System.out.print("invalid");	
		}
		
	}
}
