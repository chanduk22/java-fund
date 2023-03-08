/* Write a program to generate the following series 4, 5, 9, 18, 34,... 

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting.

Sample Input & Output:

5

4 5 9 18 34 */


import java.util.Scanner;
public class Series8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=4;
        System.out.print(4);
        double j;
        for(int i=1;i<=n-1;i++)
        {
            j=a+Math.pow(i,2);
            System.out.printf("% d",(int)j);
            a=(int)j;
        }
    }
}
