/* Write a program to find the sum of first N natural numbers.

Input & Output Format:

Input consists of one integer.

Output consists of a integer.

Sample Input & Output:

5

15 */


import java.util.Scanner;
public class Sum2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
