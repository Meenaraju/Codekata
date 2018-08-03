import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count=0;
		int ccount=0;
		char[] ch = s.toCharArray();
		try{
			for(int i=0;i<ch.length;i++){
			if(ch[i]=='('){
				count++;
			}
			else if(ch[i]==')'){
				ccount++;
			}
			}
			if(count==0 && ccount==0){
				System.out.println("invalid");
			}
			else if(count==ccount){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
		catch(Exception nef){
			System.out.println("invalid");
		}
		
	}
}
