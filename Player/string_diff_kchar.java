
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
		String s2 = sc.next();
		try{
			int n = Integer.parseInt(s2);
			int count;
			String str = "";
			if(s.length()!=s1.length()){
				System.out.println("no");
			}
			else{
				for(int i=0;i<s.length();i++){
					count=0;
					for(int j=0;j<s1.length();j++){
						if(s.charAt(i)==s1.charAt(j))
						count++;
					}
					if(count==0){
						str+=s.charAt(i);
					}
				}
				if(n==str.length()){
					System.out.println("yes");
				}
				else{
					System.out.println("no");
				}
			}
		}
		catch(NumberFormatException nef){
			System.out.println("invalid");
		}
		
	}
}
