/* Write a program to generate the following series 2, 3, 8, 63, 3968

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting

Sample Input & Output:

5

2 3 8 63 3968 */


import java.util.Scanner;
public class Series9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long a=2;
        long x;
        for( int i=0;i<n;i++)
        {
           x=(a*a)-1;
           System.out.printf("% d",a);
           a=x;
        }
    }
}
