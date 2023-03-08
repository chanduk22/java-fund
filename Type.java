/* Write a C program to find the type of array as whether it is even, odd or mixed. If all the elements of an array are even, then display the array type as even. If all the elements of an array are odd, then display the array type as odd. If an array has both even and odd elements, then display the array type as mixed.

Sample Input:
5
2
4
1
3
5

Sample Output:
Mixed */


import java.util.Scanner;
public class Type
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int odd=0,even=0;
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
        if(a[i]%2==0)
        {
            even++;
        }
         else if(a[i]%2==1)
            {
                odd++;
            }
        }
            if(n==odd)
            {
               System.out.println("odd");
            }
             else if(n==even)
            {
               System.out.println("Even");
            }
            else
            {
                System.out.println("Mixed");
            }
    }
}
