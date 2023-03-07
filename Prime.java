/* Write a program to find whether the given number is Prime number or Not.

Input & Output Format:

Input consists of one integer.

Output consists of a string.

If it is prime then display "Prime Number" or if it is not prime then display "Not a Prime"

Sample Input:

2

Sample Output:

Prime Number  */


import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                a++;
                System.out.println("Not a Prime");
                break;
            }
        }
        if(a==0)
        {
            System.out.println("Prime Number");
        }
    }
}
