/* Write a C program to delete the element from the given location in an array:

Input & Output Format:

Input consists of two integer and one array.
First Input consists of size of an array.
Second give the array elements based on their size.
Third input consists of the position where we need to delete it.
Output consists of an array after deletion.

Sample Input:
5
1
2
3
4
5

4

Sample Output:
1
2
3
5 */


import java.util.Scanner;
public class Delete
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
        int m=sc.nextInt();
        int count=0;
        for(int j=0;j<n;j++)
        {
            if(m!=ar[j])
            count++;
        }
        if(count==n)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            for(int l=0;l<n;l++)
            {
                if(m!=ar[l])
                System.out.println(ar[l]);
            }
        }
    }
}
