/* Write a program to generate the following series 95.0, 115.5, 138.0,..., 189.0 

Input format: 

The input containing an integer which denotes 'n' 

Output format:

Print the series and refer the sample output for formatting

Sample Input & Output:

5

95.0 115.5 138.0 162.5 189.0 */


import java.util.Scanner;
public class Series10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=95.0;
        double b=20.5;
        double x;
        System.out.printf("%.1f",a);
        for( int i=1;i<=n-1;i++)
        {
           x=a+b;
           System.out.printf("% .1f",x);
           a=x;
           b=b+2;
        }
    }
}
