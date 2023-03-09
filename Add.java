/*Write a  program to add two arrays:

Input & Output Format:

First Input consists of size of an array for two arrays

Second Input consists of first array elements.

Third Input consists of second array elements.

Output consists of an array

Sample Input:
3
1
2
3
4
5
6

Sample Output:

5 7 9 */


import java.util.Scanner;
public class Add
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
           b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c[i]=a[i]+b[i];
            System.out.print(c[i]+" ");
        }
        
    }
}
