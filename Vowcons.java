/* Write a program to check whether the given character is vowel or consonant or Not an alphabet.

Input format: 

The input consist of a character 

Output format: 

The output consists of a below-given string “Vowel” / “Consonant” / “Not an alphabet”

Sample Input: 

a 

Sample Output: 

Vowel */


import java.util.Scanner;
public class Vowcons
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='a'|| c=='e'|| c=='i' ||c=='o' || c=='u' )
        {
            System.out.println("vowel");
        }
        else if(c=='1'|| c=='2' || c=='3'|| c=='4' || c=='5' || c=='6'|| c=='7' || c=='8'|| c=='9' || c=='0' )
        {
        System.out.println("not an alphabet");
     	}
        
        else
        {
            System.out.println("consonant");
        }
	        //write your code
    }
}
