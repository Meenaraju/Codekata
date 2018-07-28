import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc= new Scanner(System.in);
	  String s1 = sc.next();
	  String s2 = sc.next();
	  int count=0;
	  int max=0;
	  
	  if(s1.length()>s2.length()){
	  	max=s1.length();
	  }
	  else{
	  	max = s2.length();
	  }
	  	if(s1.length()>=1&&s2.length()>=1){
	  		if(s1.length()<=1000 && s2.length()<=1000){
	  		for(int j=0;j<max;j++){
	  			
	  			 if(s2.length()==1 ){
	  				if(s1.charAt(j)==s2.charAt(0))
	  				count++;
	  			}
	  			else{
	  			if(s1.length()==j || s2.length()==j){
	  				break;
	  			}
	  			else if(s1.charAt(j)==s2.charAt(j)){
	  				count++;
	  			}
	  			}
	  		}
	  		if(count>0){
	  			int sum =Math.abs(count-max);
	  			System.out.print(sum);
	  		}
	  		else{
	  			System.out.print(s2.length());
	  		}
	  		}
	  	}
	  	
	 
	}
}
