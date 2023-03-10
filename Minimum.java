/*You are given two vectors v1=(x1,x2,...,xn) and v2=(y1,y2,...,yn). The scalar product of these vectors is a single number, calculated as x1y1+x2y2+...+xnyn.
Suppose you are allowed to permute the coordinates of each vector as you wish. Choose two permutations such that the scalar product of your two new vectors is the smallest possible, and output that minimum scalar product.

Input & Output Format:

Input consists of 1 integer and two arrays.

First input consists of an size of an array.

second inputs consists of elements of two arrays.

Output consists of a one integer.

Sample Input:

3
1 3 5
2 4 1

Sample Output:
15 */


import java.util.*;
public class Minimum
{
public static void main(String[] args)
{
	int n;
	Scanner sc=new Scanner(System.in);
	n = sc.nextInt();
	int[] arr1=new int[n];
	int[] arr2=new int[n];
	int i;
	for(i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
			{
				arr2[i]=sc.nextInt();
			}
		Arrays.sort(arr1);
		for (i=0;i<n;++i)
				{
					for (int j=i+1;j<n;++j)
						{
							if (arr2[i]<arr2[j])
								{
									int a=arr2[i];
									arr2[i]=arr2[j];
									arr2[j]=a;
								}
						}
				}
		int sum=0;
		for(i=0;i<n;i++)
			{
				sum=sum+(arr1[i]*arr2[i]);
			}
		System.out.println(sum);
	}	
}
