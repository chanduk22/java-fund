/* Write a  program to remove the duplicate elements from an array:
INPUT FORMAT:

Input consists of 1 integer and 1 array.

The first integer corresponds to the size of the array.

The next integers correspond to the elements in the array.

OUTPUT FORMAT:

The output consists of an array with no duplicate elements.

Sample Input:
5

1

2

3

4

4

Sample Output:

1 2 3 4  */


import java.util.*;
public class Remove
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
        ar[i]=sc.nextInt();
        }
        int count;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=i+1;j<n;j++)
            {
            if(ar[i]==ar[j])
            count++;
            }
        if(count==0)
           System.out.println(ar[i]);
        }
    }
}
