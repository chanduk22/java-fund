/* Write a program to find the maximum element in an array:

Sample Input:
5
1
2
33
4
5

Sample Output:
33 */


import java.util.Scanner;
public class Max
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        int m=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }
        }
        System.out.println(m);
    }
}
