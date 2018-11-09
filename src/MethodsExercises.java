import java.util.Scanner;

public class MethodsExercises {
    public static void main (String[] arg) {

//        System.out.println(add(3, 6));
//        System.out.println(subtact(10, 4));
//        System.out.println(multiply(11, 12));
//        System.out.println(divide(35, 5));
//        System.out.println(modulus(10, 3));


        System.out.println(getInteger(10, 32));


    }
// 1. Basic Arithmetic
//
//      a. Create four separate methods. Each will perform an arithmetic operation:
//          *Addition
//          *Subtraction
//          *Multiplication
//          *Division

//      b. Each function needs to take two parameters/arguments so that the operation can be performed.
//
//      c. Test your functions and verify the output.
//
//        Add a modulus function that finds the modulus of two numbers.
//
//                Food for thought: What happens if we try to divide by zero? What should happen?
//


//    public static int add (int num1, int num2) {
//        return (num1 + num2);
//    }
//
//    public static int subtact (int num1, int num2) {
//        return (num1 - num2);
//    }
//
//    public static int multiply (int num1, int num2) {
//        return (num1 * num2);
//    }
//
//    public static int divide (int num1, int num2) {
//        return (num1 / num2);
//    }
//
//    public static int modulus (int num1, int num2) {
//        return (num1 % num2);
//    }

//                Bonus
//
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion.

//============================================================================================================

// 2. Create a method that validates that user input is in a certain range
//    The method signature should look like this:

//          public static int getInteger(int min, int max);

//      and is used like this:

//          System.out.print("Enter a number between 1 and 10: ");
//          int userInput = getInteger(1, 10);

        public static int getInteger(int min, int max) {
            System.out.println("Enter a number between " + min + " and " + max + ": ");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();

            if(userInput >= min && userInput <= max) {
                System.out.println("You're within range!");
                return userInput;
            } else {
                System.out.println("Sorry, try again.");
                return getInteger(min, max);
            }

//            int userInput = getInteger(sc.nextInt(min), sc.nextInt(max));

//            return userInput;

        }


//============================================================================================================





//============================================================================================================






//============================================================================================================






//============================================================================================================


}
