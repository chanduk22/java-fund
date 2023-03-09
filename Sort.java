/* Write a  program to sort the given array in ascending order:

Input & Output Format:

Input consists of 1 integer and 1 array

First input consists of size of an array.

Second inputs consists of an elements depends upon their size.

Output consists of an array in ascending order.

Sample Input:
5
54
68
25
14
74

Sample Output:
14
25
54
68
74 */


import java.util.Scanner;
public class Sort
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j,temp;
        for(i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
