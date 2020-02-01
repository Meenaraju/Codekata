import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
		System.out.println(primepal(n));
	}
	
	static boolean isprime(int num){
	    if(num%2==0||num<2)
	    return num==2;
	    for(int i=3;i*i<=num;i+=2)
	    if(num%i==0)
	    return false;
	    
	  return true;
	}
	static int primepal(int num){
	    for(int i=1;i<100000;++i){
	        String s=Integer.toString(i);
	        StringBuffer sbr=new StringBuffer(s);
	        sbr.reverse();
	        System.out.println(s);
	        int y=Integer.parseInt(s+sbr.substring(1).toString());
	        System.out.println(y);
	        if(y>=num && isprime(y)==true ){
	            return y;
	        }
	    }
	    return -1;
	}
	
}
