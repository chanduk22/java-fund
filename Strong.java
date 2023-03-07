/* Program to check if a given number is a strong number or not is discussed here. A strong number is a number in which the sum of the factorial of the digits is equal to the number itself.

Input & Output Format:
Input consists of one integer.

Output consists of a string. 

If it is true then display "Strong Number" else display "Not a Strong Number".

Sample Input & Output:

145

Strong Number */


import java.util.Scanner;
public class Strong
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact,count,sum=0,i;
       int temp=n;
        while(n!=0)
        {
            i=1;
            fact=1;
            count=n%10;
            while(i<=count)
            {
                fact=fact*i;
                i++;
            }
          sum=sum+fact;
          n=n/10;
            
        }
        if(sum==temp)
        System.out.println("Strong Number");
        else
         System.out.println("Not a Strong Number");
        
    }
}
