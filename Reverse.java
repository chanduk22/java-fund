/* Write program to reverse a number is discussed here. We can reverse a number using loop and arithmetic operators in both iterative and recursive approaches. 

Input & Output Format:

Input consists of a integer.

Output consists of reversed input.

Sample Input: 

13579

Sample Output: 

97531  */


import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rev=0,r;
        while(a>0)
        {
        r=a%10;
        rev=(rev*10)+r;
        a=a/10;
        }
        System.out.println(rev);
        
    }
}
