import java.util.Scanner;

public class ControlFlowExercises {
	public static void main(String[] args) {

		// Exercise 1

//		a. Loop Basics
//			While
		//		Create an integer variable i with a value of 5.
		//		Create a while loop that runs so long as i is less than or equal to 15
		//		Each loop iteration, output the current value of i, then increment i by one.
		//		Your output should look like this:
//
//		5 6 7 8 9 10 11 12 13 14 15

//		int i = 5;
//
//		while (i <= 15) {
//			System.out.printf(i + " ");
//			i++;
//		}

		// for loop version
//		int i;
//
//		for(i = 5;i <= 15;i += 1 ) {
//			System.out.printf(i + " ");
//		}

//		b. Do While
//
//			Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//		int num = 0;
//
//		do {
//			System.out.println(num);
//			num += 2;
//		} while (num <= 100);

		// for loop version
//		int num;
//
//		for(num = 0; num <= 100; num += 2) {
//			System.out.println(num);
//		}

//			Alter your loop to count backwards by 5's from 100 to -10.

//		int num = 100;
//
//		do {
//			System.out.println(num);
//			num -= 5;
//		} while (num >= -10);

		// for loop version
//		int num;
//
//		for(num = 100; num >= -10; num -= 5) {
//			System.out.println(num);
//		}

//			Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//			2
//			4
//			164
//			256
//			65536

//		long n = 2;
//
//		do {
//			System.out.println(n);
//			n *= n;
//		} while (n <= 1000000);

		// for loop version
//		long n;
//
//		for(n = 2; n <=1000000; n *= n) {
//			System.out.println(n);
//		}



		// Exercise 2 - Fizzbuzz

//		One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//		-Write a program that prints the numbers from 1 to 100.

//			for(int num = 1; num <= 100; num += 1) {
//				System.out.println(num);
//			}

//		-For multiples of three print “Fizz” instead of the number

//		-For the multiples of five print “Buzz”.

//		-For numbers which are multiples of both three and five print “FizzBuzz”.

			for(int num = 1; num <= 100; num += 1) {
				if (num % 15 == 0) {
					System.out.println("FizzBuzz");
				} else if (num % 5 ==0) {
					System.out.println("Buzz");
				} else if (num % 3 == 0) {
					System.out.println("Fizz");
				} else {
					System.out.println(num);
				}
			}





	}
}


