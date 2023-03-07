/* Program to find prime numbers in a given range is discussed here. A number is said to be prime if it is divisible by 1 and the number itself. Program to find prime numbers in a given range using loop

Input & Output Format:

Input consists of two integers. 

First integer corresponds to lower value.

Second integer corresponds to upper value.

Output consists of the prime numbers between the two intervals.

Sample Input: 

1

10

Sample Output:

2

3

5

7 */


import java.util.Scanner;
public class Range
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,j;
        for(i=a;i<=b;i++)
        {
            for(j=2;j<i;j++)
            {
            if(i%j==0)
            {
              break;
            }
            }
            if(i==j)
            {
                System.out.println(i);
            }
        }
    }
}
