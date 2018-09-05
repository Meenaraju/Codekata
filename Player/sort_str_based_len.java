
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String g = sc.nextLine();
		try{
		int n = Integer.parseInt(g);
		String temp="";
		String[] s = new String[n];
		for(int i=0;i<n;i++){
			s[i] = sc.next();
		}
		Arrays.sort(s);
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(s[i].length()>s[j].length()){
					temp = s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(s[i]);
			if(i<n-1){
				System.out.print(" ");
			}
		}
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
	}
}
