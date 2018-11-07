import java.util.Scanner;

public class ConsoleExercises {
	public static void main(String[] args) {

//		double pi = 3.14159;

//		String piMessage = String.format("The value of pi is approximately %.2f", pi);
//		System.out.print(piMessage);
//
// 		System.out.printf("The value of pi is approximately %.2f", pi);
//		System.out.format("The value of pi is approximately %.2f", pi);


// 1.
//	Prompt a user to enter a integer and store that value in an int
// 	variable using the nextInt method.


//====================================================================
		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Please enter an integer");
//
//		int userInput = sc.nextInt();
//
//		System.out.print("Your integer is:\n" + userInput);
//====================================================================

//		-What happens if you input something that is not an integer?



// 2.
//	Prompt a user to enter 3 words and store each of them in a separate variable,
// 	then display them back, each on a newline.

//====================================================================
//System.out.println( "Please enter 3 words: ");

//String firstWord = sc.next();
//String secondWord = sc.next();
//String thirdWord = sc. next();
////
////System.out.print( "Your 3 words are:\n" + firstWord + "\n" + secondWord + "\n" + thirdWord );
//System.out.printf("%s%n%s%n%s%n", firstWord, secondWord, thirdWord);
//====================================================================

//		-What happens if you enter less than 3 words?
//		-What happens if you enter more than 3 words?




// 3.
//	Prompt a user to enter a sentence, then store that sentence in a String variable
// 	using the .next method, then display that sentence back to the user.
//
//====================================================================
//System.out.println("Please enter a sentence.");
//String userSentence = sc.next();
//System.out.print("Your sentence is:\n" + userSentence);

//====================================================================

//		-do you capture all of the words?

// 4.
//	Rewrite the above example using the .nextLine method.
//
//====================================================================
//System.out.println("Please enter a sentence.");
//String userSentence = sc.nextLine();
//System.out.print("Your sentence is:\n" + userSentence);

//====================================================================



//Calculate the perimeter and area of Codeup's classrooms
//
// 1.
// 	Prompt the user to enter values of length and width of a classroom at Codeup.
//
//	Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//
//		-Assume that the rooms are perfect rectangles.
//		-Assume that the user will enter valid numeric data for length and width.

//====================================================================
System.out.println("Please enter the length and width of your classroom in feet.");
String length = sc.nextLine();
String width = sc.nextLine();

int l = Integer.parseInt(length);
int w = Integer.parseInt(width);


//====================================================================

// 2.
//	Display the area and perimeter of that classroom.
//
//	The area of a rectangle is equal to the length times the width,
// 	and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

//====================================================================
System.out.println("The area of the room is " + ( l * w ) + " ft.");
System.out.println("The perimeter of the room is " + ((l * 2) + (w * 2)) + " ft.");
//====================================================================
//
// 3.
//	Bonuses
//
//		-Accept decimal entries
//		-Calculate the volume of the rooms in addition to the area and perimeter


	}
}

