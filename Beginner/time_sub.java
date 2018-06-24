package javaapplication1;
import java.util.*;
public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a1,b1,d1,e1;
       a1 = sc.next();
       b1 = sc.next();
       d1 = sc.next();
       e1 = sc.next();
       try{
       int a=Integer.parseInt(a1);
       int b=Integer.parseInt(b1);
       int d=Integer.parseInt(d1);
       int e=Integer.parseInt(e1);
       int c = a-d;
       int f=b-e;
       System.out.println(Math.abs(c)+" "+Math.abs(f));
       }
       catch(NumberFormatException nef){
           System.out.println("invalid");
       }
        
    }
}
