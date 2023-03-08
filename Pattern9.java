/* Write a Python program to print the given pattern from user-defined values(dynamic values).

Sample input 1:     
5
Sample output 1:
*********
  *******
    *****
      ***
        *

 Sample input 2:
8
Sample output 2:

***************
  *************
    ***********
      *********
        *******
          *****
            ***
              *  */

 

import java.util.Scanner;
public class Pattern9
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=n;i>=1;i--)
       {
           for( int s=1;s<=n-i;s++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=(i*2)-1;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
