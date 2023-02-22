/* Each Sunday, a Paper bags agency sells w copies of a special edition Paper bags for Rs.x per copy. The cost to the agency of each Paper bag is Rs.y . The agency pays a fixed cost for storage, delivery and so on of Rs.100 per Sunday. The Paper bag agency wants to calculate the profit which it obtains only on Sundays. Can you please help them out by writing a program to compute the profit given w, x and y. 

INPUT FORMAT:
Input consists of 3 integers: w, x, and y.
w is the number of copies sold
x is the cost per copy
y is the cost the agency spends per copy.

OUTPUT FORMAT:
The output consists of a single integer which corresponds to the profit obtained by the paper bag agency.

Sample Input:
1000

2

1

Sample Output:

900  */


import java.util.*; 
public class Paper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float n=b*a;
        float m=a*c;
        System.out.printf("%.0f",n-m-100);
        }
}
