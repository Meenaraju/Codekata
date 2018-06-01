import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try{	
        int n, n1, n2, i, rem, temp, count=0;
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        for(i=n1+1; i<n2; i++)
        {
            temp = i;
            n = 0;
            while(temp != 0)
            {
                rem = temp%10;
                n = n + rem*rem*rem;
                temp = temp/10;
            }
            if(i == n)
            {
            
                if(count == 0)
                {
                   
                }
                System.out.print(i + "  ");
                count++;
            }
        }
	}
	catch(Exception e){
		System.out.println("invalid input");
	}

	}
}
