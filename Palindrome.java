/* Program to check whether the given number is a Palindrome or  Not a Palindrome is discussed here. Any number is said to be a palindrome if the original number and the reverse of the original number are the same.

For example, 1234321 is a palindrome.

Original number = 1234321

The reverse of the number = 1234321

Sample Input:
454

Sample Output:

Palindrome */


import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rev=0,r,b;
        b=a;
        while(a>0)
        {
        r=a%10;
        rev=(rev*10)+r;
        a=a/10;
        }
        if(rev==b)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
