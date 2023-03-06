/* Write a  program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June, November-December] .

Input Format:

The first line of the input contains an integer which corresponds to the number of the month. [ January is 1, Feb is 2 and so on].  

The second line of the input consists of a floating point number which corresponds to the room rent per day. 

The third line of the input consists of an integer which corresponds to the number of days stayed in the hotel.

Output Format:

Output consists of a single line which displays the hotel tariff to be payed.  

Hotel tariff should be displayed correct to 2 decimal places. 

Refer  sample output  for format details.

Sample Input 1:

3

1500

2

Sample Output 1:

Hotel Tariff: Rs.3000.00

Sample Input 2:

4

2000

2

Sample Output 2:

Hotel Tariff: Rs.4800.00  */


import java.util.Scanner;
public class Hotel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b=sc.nextFloat();
        int c=sc.nextInt();
        float h;
        if(a>=1 && a<=12)
        {
            if(a==4 || a==5 || a==6 || a==11 || a==12)
            {
            b+=(20*b/100);
            h=b*c;
            System.out.printf("Hotel Tariff: Rs.%.2f",h);
            }
            else
            {
                h=b*c;
                System.out.printf("Hotel Tariff: Rs.%.2f",h);
            }
        }
            else
            System.out.println("Invalid Input");
        
    }
}
