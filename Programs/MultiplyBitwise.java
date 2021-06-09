/*
Write a Java Program to multiply a given number by 4 using Bitwise operators.
*/

import java.util.Scanner;
public class MultiplyBitwise 
{
    public static void main(String[] args) 
    {
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = sc.nextInt();
        
        int mul = n << 2;                    // Shifts the bits of number to the left and fill 0 whre voids are there.
        System.out.println("Answer:"+mul);
    }
}
