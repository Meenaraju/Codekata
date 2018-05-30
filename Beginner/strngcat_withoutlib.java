import java.util.Scanner;
import java.util.Arrays;
 class Ideone{
   public static void main(String arg[])throws Exception {
      try{
          int i;
          int n=0;
          Scanner sc = new Scanner(System.in);
          String s=sc.next();
          String s1=sc.next();
          String s2 = "";
          if(n<=1000){
          for(i=0;i<s.length();i++){
             s2+= s.charAt(i);
          }
          for(int j=0;j<s1.length();j++){
          	s2+= s1.charAt(j);
          }
          System.out.println(s2);
          }
          else{
          	System.out.println("size exceeds");
          }
      }
      
     catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
