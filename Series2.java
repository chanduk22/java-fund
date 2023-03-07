/* Write a program to generate the following series --- 6,11,21,36,56,... 

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting.

Sample Input:

5

Sample Output:

6 11 21 36 56  */


import java.util.Scanner;
public class Series2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=6;
        int a=5;
        System.out.print(r+ " ");
        for( int i=1;i<=n-1;i++)
        {
            r=r+a;
            System.out.print(r + " ");
            a=a+5;
        }
        //Write your code
    }
}
