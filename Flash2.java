/* Diffny also joined the group of Team Flash. Meanwhile, Diffny also moved to a new house in the same locality nearby to the other three. Now the houses of Joe, Ramsey and vixon are located in the shape of a triangle. Harry also has moved to a house in the same locality. When the Team Flash asked daffy about the location of his house , he said that his house is equidistant from the houses of the other 3. Can you please help them find out the location of the house?Given the 3 locations {(x1,y1), (x2,y2) and (x3,y3)} of a triangle, write a program to determine the point which is equidistant from all the 3 points.

INPUT FORMAT: 

Input consists of 6 integers. 

The first integer corresponds to x1. 

The second integer corresponds to y1. 

The third and fourth integers correspond to x2 and y2 respectively. 

The fifth and sixth integers correspond to x3 and y3 respectively. 

OUTPUT FORMAT: 

The output consists of two floating point numbers (with one decimal place) which correspond to the location of the house.

Sample Input

2

4

10

15

5

8

Sample Output

5.7
9.0 */


import java.util.Scanner;
public class Flash2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        float a,b;
        a=x1+x2+x3;
        b=y1+y2+y3;
        System.out.printf("%.1f \n%.1f",a/3,b/3);
    }
}
