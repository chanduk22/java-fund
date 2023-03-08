/* Write a program to generate the following series --- 1, 2.0, 3.0, 6.0, 9.0, 18.0, 27.0,... 

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting

Sample Input & Output:

5

1 2.0 3.0 6.0 9.0 */


import java.util.Scanner;
public class Series7
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float a=1;
        float b=2;
        System.out.printf("%d",(int)a);
        System.out.printf("% .1f",b);
        for(int i=1;i<n-1;i++)
        {
            if(i%2==0)
            {
                b=b*3;
                System.out.printf("% .1f",b);
            }
            else
            {
                a=a*3;
                System.out.printf("% .1f",a);
            }
        }
    }
}
