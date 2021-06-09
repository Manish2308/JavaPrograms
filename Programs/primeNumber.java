/*
Write a Java program to print to input a number and check whether the number is Prime or not.
*/

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		boolean flag = false;
		
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		
		                                      //Writing this condition for non-prime numbers.
		for(int i=2; i<=number; ++i)
		{
			if(number % i == 0)
			{
				flag = true;
				break;
			}
		}
		
		if(!flag)
			System.out.println(number + " is a Prime Number.");
		else
			System.out.println(number + " is not a Prime Number.");

	}

}
