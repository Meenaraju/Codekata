import java.util.Scanner;
import java.util.Arrays;
 class Ideone{
   public static void main(String arg[])throws Exception {
      try{
          int i;
          Scanner sc = new Scanner(System.in);
          String s=sc.next();
          String s1=sc.next();
          String[] ss=new String[2];
          for(i=0;i<2;i++){
          if((s.length()<0||s.length()>1000)&&(s1.length()<0||s1.length()>1000))
                System.out.println(" invalid value");
          else{
          	
                ss[0]=s;
                ss[1]=s1;
                Arrays.sort(ss);
            }
        }
        System.out.println(ss[1]);
      }
      
     catch(Exception e){
            System.out.println("enter valid value");
      }
    }
}
