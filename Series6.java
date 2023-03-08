/* Write a program to generate the following series --- 0,2,8,14,...,34 

Input format: 

The input containing an integer which denotes 'n'

Output format: 

Print the series and refer the sample output for formatting.

Sample Input & Output:

5

0 2 8 14 24 */


import java.util.Scanner;
public class Series6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=2;
        int x;
        System.out.print(a);
        for( int i=1;i<=n-1;i++)
        {
            if(b%2==0)
            {
               x=(b*b)-2;
               System.out.printf("% d",x);
               b=b+1;
            }
            else
            {
                x=(b*b)-1;
                System.out.printf("% d",x);
                b=b+1;
            }
        }
    }
}
