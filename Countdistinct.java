/* Write a  program to count the distinct elements in an array:

Input & Output Format:

Input consists of 1 integer and 1 array.

First input consists of size of an array.

Second inputs corresponds to the array elements.

Output consists of one integer and corresponds to the count of the distinct elements.

Sample Input:

6
2
6
6
4
5
5

Sample Output:
4 */


import java.util.*;
public class Countdistinct
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        int count,m=0;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=i+1;j<n;j++){
            if(a[i]==a[j])
            count++;
            }
        if(count==0)
          m++;
        }
        System.out.println(m);
    }
}
