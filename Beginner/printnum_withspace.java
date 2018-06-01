/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try{
			
		            int n = Integer.parseInt(s);
		            String c = new Integer(n).toString();
		            int count = 0;
			while(count!=c.length()) {
				
				 System.out.print(c.charAt(count)+" ");
				 count++;
			}
		
		}
			catch(NumberFormatException e){
				System.out.println("invalid");
			}
	}
}
