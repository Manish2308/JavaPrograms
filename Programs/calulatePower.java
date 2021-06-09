/*
1. Write a Program to input a number from the user and the power factor to be calculated and diplay it to the console.
*/

import java.util.Scanner;

public class calculatePower {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int p;
		int n;
		int result=1;  // Initially kept one so that anything multiplied by 1 is the same number.
		
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		
		System.out.println("Enter the power: ");
		p = sc.nextInt();
		
		for(int i=1; i<=p; i++)
		{
			result = n * result;
		}
		
		System.out.println("Answer is: "+result);

	}

}
