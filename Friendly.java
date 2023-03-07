/* Program to find if the given numbers are Friendly pair or not (Amicable or not) is discussed here. Friendly Pair are two or more numbers with a common abundance.

Input & Output format: 

Input consists of 2 integers.
The first integer corresponds to number 1 and the second integer corresponds to number 2.
If it is a Friendly Pair display Friendly Pair or displays Not Friendly Pair.
For example,6 and 28 are Friendly Pair.

(Sum of divisors of 6)/6 = (Sum of divisors of 28)/28.

Sample Input:
6

28

Sample Output:

Friendly Pair */


import java.util.Scanner;
public class Friendly
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=0,b=0;
        int i;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                a=a+1;
            }
          
        }
        for(i=1;i<n;i++)
        {
            if(m%i==0)
            {
                b=b+1;
            }
           
        }
        if(n>m)
        {
        if((a/n)==(b/m))
        {
            System.out.println("Friendly Pair");
        }
        }
        else if(n<m)
        {
            System.out.println("Not Friendly pair");
        }
        else
        {
            System.out.println("Not Friendly pair");
        }
    }
}
