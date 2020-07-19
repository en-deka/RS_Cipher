//**********************************************************************
// Cipher.java 		Author: Allison Fischer
// Summer 2020			PROGRAMMING ASSIGNMENT 1
// 
// Encodes the sum of five user input numbers in range 0 - 19 inclusive
// using a Caesar Code.
//***********************************************************************

import java.util.Scanner; 
import java.util.Random;

public class Cipher {

	public static void main(String[] args) {
		int random_key;
		int first;
		int second;
		int third;
		int fourth;
		int fifth;

		Random gen = new Random();
		random_key = gen.nextInt(10);
		Scanner scan = new Scanner(System.in);
		System.out
				.println("Programming Fundamentals\r\n" + "NAME: Allison Fischer\r\n" + "PROGRAMMING ASSIGNMENT 1\r\n\n"
						+ "Welcome to the Cipher program.\r\n" + "Please enter 5 numbers between 0 and 19");

		/*
		 * Receives five user number inputs; if number out of range, gives statement:
		 * "Please read directions and try again!" and terminates the program.
		 */
		System.out.print("1st number: ");
		first = scan.nextInt();
		if (first >= 0 && first <= 19)
			System.out.print("2nd number: ");
		else {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}
		second = scan.nextInt();
		if (second >= 0 && second <= 19)
			System.out.print("3rd number: ");
		else {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}
		third = scan.nextInt();
		if (third >= 0 && third <= 19)
			System.out.print("4th number: ");
		else {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}
		fourth = scan.nextInt();
		if (fourth >= 0 && fourth <= 19)
			System.out.print("5th number: ");
		else {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}
		fifth = scan.nextInt();
		System.out.print("\r\n");

		// Output plaintext total of five user input numbers.
		int total_plaintext = first + second + third + fourth + fifth;
		if (fifth >= 0 && fifth <= 19)
			System.out.println("Total = " + total_plaintext);
		else {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}
		// Calculates encoded number for ones' place of the plaintext total.
		int encoded_ones = (((total_plaintext % 10) + random_key) % 10);
		// Calculates encoded number for tens' place of the plaintext total.
		int encoded_tens = (((total_plaintext / 10) + random_key) % 10);

		System.out.println("Your random key is " + random_key);
		// Calculates
		System.out.println("Your encoded number is " + encoded_tens + encoded_ones);

	}

}

