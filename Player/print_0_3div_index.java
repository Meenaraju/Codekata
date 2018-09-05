
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String g = sc.nextLine();
		if(g.length()==0){
			System.out.println("invalid");
		}
		else{
		if(g.length()>=1 && g.length()<=100000){
		char[] ch = g.toCharArray();
		System.out.print(ch[0]);
		for(int i=1;i<ch.length;i++){
			if(i%3==0){
				System.out.print(ch[i]);
			}
		}
		}
		}
	}
}
