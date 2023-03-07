/* Write a program to find the sum of numbers in a given range is discussed here. Given the starting and ending interval, the sum of all the numbers in that range will be displayed as output.

For example,

Input: 1 10

Output: 55

Explanation: 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55

Input & Output Format:
Input consists of two integers.

First input consists of the start value.

Second input consists of the end value.

Output consists of the sum of range.

Sample Input 1:

1

10

Sample Output 1:

55 */

import java.util.Scanner;
public class Sumofnum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        for(int i=0;i<=m;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
