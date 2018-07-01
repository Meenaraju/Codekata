	import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String[] s1 = new String[3];
		String[] s2 = new String[3];
		for(int i=0;i<3;i++){
			s1[i]=sc.next();
		}
		for(int i=0;i<3;i++){
			s2[i]=sc.next();
		}
		try{
		int[] a = new int[s1.length];
		int[] b =  new int[s2.length];
		int count=0;
		for(int i=0;i<3;i++){
			
			a[i]=Integer.parseInt(s1[i]);
		}
		
		for(int i=0;i<3;i++){
			b[i]=Integer.parseInt(s2[i]);
		}
		
		for(int i=0;i<2;i++){
			
			if(a[i]==a[i+1] || b[i]==b[i+1])
			{
			
			count=1;
			
			}
		}
		if(count==1){
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
		}
		catch(NumberFormatException nef){
			System.out.print("invalid");
			
		}
	}
}
