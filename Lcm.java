/* Write a program to find LCM of two numbers is discussed here. Two numbers are obtained as input and the prime factors of both the numbers are found. The product of the union of prime factors of both the numbers gives the LCM of the two numbers.

Input & Output Format:

Input consists of two integers.

Output consists of the lcm of two numbers.

Sample Input:

5

30

Sample Output:

LCM of 5 and 30 is 30  */


import java.util.Scanner;
public class Lcm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=(x>y)?x:y;
        int i;
        for( i=a;i<=x*y;i=i+a)
        {
            if(i%x==0 && i%y==0)
            break;
        }
        System.out.printf("LCM of %d and %d is %d",x,y,i);
    }
}
