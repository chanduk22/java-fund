/* Write a C program to reverse an array:

Input & Output Format:

Input consists of 1 integer and 1 array.

First input consists of the size of an array.

Second inputs consists of array elements based on their array size.

Sample Input:
3
1
2
3

Sample Output:
3
2
1 */


import java.util.Scanner;
public class Reverse2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int j=0;j<n;j++)
        {
            ar[j]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(ar[i]);
        }
    }
}
