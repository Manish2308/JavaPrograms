/*
Write a program in java to calculate the sum of odd and even numbers.
*/

import java.util.Scanner;
public class sumOfOddandEven 
{
    public static void main(String[] args) 
    {
        int n, sumE = 0, sumO = 0;
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the number of elements in array:");
        n = sc.nextInt();
      
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
      
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
      
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)  //Checking the numbers are Even or not
            {
                sumE = sumE + a[i];
            }
            else
            {
                sumO = sumO + a[i];
            }
        }
      
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Sum of Odd Numbers:"+sumO);
    }
}
