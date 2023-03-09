/* Write a  program to find whether two arrays are same or not. Two arrays are said to be same if the sum of both the arrays are same and size of arrays are same:

INPUT FORMAT:

Input consists of 2 integers and 2 arrays.

Integers correspond to the size of arrays.

If two arrays are same, display "Same" else display "Not Same"


Sample Input:
3
3
1
2
3
1
2
3

Sample Output:
Same */


import java.util.Scanner;
public class Same
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int x=0,x1=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
             x=x+a[i];
        }
        for(int j=0;j<m;j++)
        {
            b[j]=sc.nextInt();
            x1=x1+b[j];
        }
        if(x==x1 && n==m)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }
    }
}
