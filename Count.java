/* Write a program to count the number of even and odd elements in an array:

Sample Input:
3
1
2
3

Sample Output:
Odd: 2
Even: 1 */


import java.util.Scanner;
public class Count
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int odd=0,even=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        
            if(a[i]%2==0)
            {
               even=even+1;
            }
            else
            {
                odd=odd+1;
            }
        }
        
        System.out.printf("Odd: %d\n",odd);
        System.out.printf("Even: %d",even);
    }
}
