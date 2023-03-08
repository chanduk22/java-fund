/* Write a Python program to print the given pattern from user-defined values(dynamic values).

Sample Input 1:
5
Sample output 1:
*****
 ****
  ***
   **
    * 

Sample input 2:
8
Sample output 2:
********
 *******
  ******
   *****
    ****
     ***
      **
       * */


import java.util.Scanner;
public class Pattern6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int s=n;s>i;s--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
