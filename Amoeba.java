/* The environmental eco club  have discovered a new Amoeba that grows in the order of a Fibonacci series every month. They are exhibiting their amoeba in a national conference. They want to know the size of the amoeba at a particular time instant. If a particular month’s index is given can you write a  program that displays the amoeba’s size……???
//Use Dynamic Programming Strategy

Note: The size of the amoeba on month 1, 2, 3, 4, 5, 6,7 ..will be 0, 1, 1, 2, 3, 5, 8 respectively.

[All text in bold corresponds to input and the rest to output]

Sample input and Output 1:

Enter the number of Months :

7

The amoeba size is 8

Sample input and Output 2:

Enter the number of Months :

12

The amoeba size is 89  */


import java.util.Scanner;
public class Amoeba
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c=1,m;
        System.out.printf("Enter the number of Months :\n");
        m=sc.nextInt();
        for(int i=3;i<m;i++)
        {
            a=b;
            b=c;
            c=a+b;
        }
            System.out.printf("the amoeba size is %d\n",c);
        
    }
}
