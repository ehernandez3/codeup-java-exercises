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

//			for(int num = 1; num <= 100; num += 1) {
//				if (num % 15 == 0) {
//					System.out.println("FizzBuzz");
//				} else if (num % 5 ==0) {
//					System.out.println("Buzz");
//				} else if (num % 3 == 0) {
//					System.out.println("Fizz");
//				} else {
//					System.out.println(num);
//				}
//			}



		// Exercise 3 - Display a table of powers.
//
//		-Prompt the user to enter an integer.
//		-Display a table of squares and cubes from 1 to the value entered.
//		-Ask if the user wants to continue.
//		-Assume that the user will enter valid data.
//		-Only continue if the user agrees to.
//
// 		Example Output
//
//		What number would you like to go up to? 5
//
//		Here is your table!
//
//				number | squared | cubed
//				------ | ------- | -----
//				1      | 1       | 1
//				2      | 4       | 8
//				3      | 9       | 27
//				4      | 16      | 64
//				5      | 25      | 125



//			Scanner in = new Scanner(System.in);
//
//			System.out.print("Please enter an integer: ");
//			int num = in.nextInt();
//			in.nextLine();
//			System.out.println("\nHere is your table!\n");
//			System.out.println("number | squared | cubed");
//			System.out.println("------ | ------- | -----");
//			for (int i = 1; i <= num; i += 1) {
//				System.out.printf("%-6d | %-7d | %-5d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
//			}



		// Exercise 4 - Convert given number grades into letter grades.
			//-Prompt the user for a numerical grade from 0 to 100.
			//-Display the corresponding letter grade.
			//-Prompt the user to continue.
			//-Assume that the user will enter valid integers for the grades.
			//-The application should only continue if the user agrees to.
			//	Grade Ranges:
			//
			//	A : 100 - 88
			//	B : 87 - 80
			//	C : 79 - 67
			//	D : 66 - 60
			//	F : 59 - 0

			Scanner in = new Scanner(System.in);
			boolean userContinues = true;
			do {
				System.out.print("Please enter a grade from 0 to 100: ");
				int numberGrade = in.nextInt();
				String letterGrade = "";
				if (numberGrade >= 88) {
					letterGrade = "A";
				} else if (numberGrade >= 80) {
					letterGrade = "B";
				} else if (numberGrade >= 67) {
					letterGrade = "C";
				} else if (numberGrade >= 60) {
					letterGrade = "D";
				} else {
					letterGrade = "F";
				}

				System.out.println("\n" + letterGrade + "\n");
				System.out.print("Would you like to enter another grade? Please enter yes or no: ");
				in.nextLine();
				String answer = in.next();
				if (!answer.equalsIgnoreCase("yes")) {
					userContinues = false;
				}
			} while (userContinues);

	}
}


