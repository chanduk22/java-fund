/*You are given two vectors v1=(x1,x2,...,xn) and v2=(y1,y2,...,yn). The scalar product of these vectors is a single number, calculated as x1y1+x2y2+...+xnyn.
 Suppose you are allowed to permute the coordinates of each vector as you wish. Choose two permutations such that the scalar product of your two new vectors is the largest possible, and output that maximum scalar product.

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
27 */



import java.util.*;
public class Maximum
{
    public static void main(String[] args)
    {
	int a;
	Scanner sc =new Scanner(System.in);
	a = sc.nextInt();
	int[] arr1 = new int[a];
	int[] arr2 = new int[a];
	int i;
	for(i = 0; i <a ; i++)
		{
			arr1[i] = sc.nextInt();
		}
		for(i = 0; i <a; i++)
			{
				arr2[i] = sc.nextInt();
			}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int sum = 0;
		for(i = 0; i <a; i++)
			{
				sum = sum + (arr1[i] * arr2[i]);
			}
		System.out.println(sum);
    }
}
