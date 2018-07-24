import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc= new Scanner(System.in);
	  String s = sc.nextLine();
	  try{
	  	int n = Integer.parseInt(s);
	           String[] s1 = new String[n];
	           	if(n>=1 && s1.length<=100000){
	  	String a=" ";
	  	for(int i=0;i<n;i++){
	  		s1[i] = sc.nextLine();
	  	}
	  	for(int i=1;i<n;i++){
	  		a="";
	  		for(int j=0;j<s1[0].length();j++){
	  			 if(s1[0].charAt(j)==s1[i].charAt(j)){
	  				a+=s1[i].charAt(j);
	  			}
	  			else{
	  				break;
	  			}
	  		}
	  		s1[0]=a;
	  	}
	  System.out.print(s1[0]);
	           	}
	           	else{
	                 System.out.println("size exceeds");
	           	}
	  }
	  catch(NumberFormatException nef){
	  	System.out.println("invalid");
	  }
	}
}
