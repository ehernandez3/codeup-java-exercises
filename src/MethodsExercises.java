import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {
    public static void main (String[] arg) {
        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
//        System.out.println(add(3, 6));
//        System.out.println(subtract(10, 4));
//        System.out.println(multiply(11, 12));
//        System.out.println(divide(35, 5));
//        System.out.println(modulus(10, 3));

// 2.
//        System.out.println(getInteger(10, 32));

// 3.
//        getFactorial(getInteger(1, 10));
//        diceRoll();
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

//============================== # 1 ====================================

//    public static int add (int num1, int num2) {
//        return (num1 + num2);
//    }
//
//    public static int subtract (int num1, int num2) {
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

//============================== # 1 ====================================
//                Bonus
//
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion.

//============================================================================================================

// 2. Create a method that validates that user input is in a certain range
//    The method signature should look like this:

//          public static int getInteger(int min, int max);
//
//      and is used like this:
//
//          System.out.print("Enter a number between 1 and 10: ");
//          int userInput = getInteger(1, 10);
//
//============================== # 2 ====================================

//        public static int getInteger(int min, int max) {
//            System.out.println("Enter a number between " + min + " and " + max + ": ");
//            Scanner sc = new Scanner(System.in);
//            int userInput = sc.nextInt();
//
//            if(userInput >= min && userInput <= max) {
//                System.out.println("You're within range!");
//                return userInput;
//            } else {
//                System.out.println("Sorry, try again.");
//                return getInteger(min, max);
//            }
//        }

//============================== # 2 ====================================

//============================================================================================================

// 3. Calculate the factorial of a number.
//
//    -Prompt the user to enter an integer from 1 to 10.
//    -Display the factorial of the number entered by the user.
//    -Ask if the user wants to continue.
//    -Use a for loop to calculate the factorial.
//    -Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    -Use the long type to store the factorial.
//    -Continue only if the user agrees to.
//    -A factorial is a number multiplied by each of the numbers before it.
//    -Factorials are denoted by the exclamation point (n!). Ex:
//
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24



//============================== # 3 ====================================

// **Passing scanner from #2 above**
//    public static int getFactorial(int userInput) {
//    long factor = 1;
//
//    for (long i = 1; i <= userInput; i += 1) {
//            factor *= i;
//        }
//        System.out.println("The factor of " + userInput + " is " + factor);
//        return 0;
//    }

//============================== # 3 ====================================

//  Bonus
//    -Test the application and find the integer for the highest factorial that can be
//      accurately calculated by this application, then modify the prompt so that it prompts
//      the user for a number "from 1 to {the highest integer that returns accurate factorial
//      calculation}". Don’t forget to change your verification too!
//    -Use Recursion to implement the factorial.

//============================================================================================================

// 4. Create an application that simulates dice rolling.
//      -Ask the user to enter the number of sides for a pair of dice.
//      -Prompt the user to roll the dice.
//      -"Roll" two n-sided dice, display the results of each, and then ask the user if
//          he/she wants to roll the dice again.
//      -Use static methods to implement the method(s) that generate the random numbers.
//      -Use the .random method of the java.lang.Math class to generate random numbers.

//============================== # 4 ====================================

//    public static void diceRoll() {
//        Scanner sc = new Scanner(System.in);
//        Random rnd = new Random()
//        int diceOne = setDiceOne(sc);
//        int diceTwo = setDiceTwo(sc);
//        System.out.println("Whenever you're ready, type \"roll\" to roll your dice: ");
//        String continueRolling = sc.nextLine();
//        String rollDice = ("roll");
////        System.out.println(diceOne);
////        System.out.println(diceTwo);
//
//        do {
//            System.out.println("")
//        } while ()
//    }
//
//    public static int setDiceOne (Scanner sc) {
//    System.out.println("Enter the number of sides for the dice 1: ");
//    return sc.nextInt();
//    }
//
//    public static int setDiceTwo (Scanner sc) {
//        System.out.println("Enter the number of sides for the dice 2: ");
//        return sc.nextInt();
//    }

// Github Solution Exercise 4

//    public static int randomWithRange(int min, int max)
////    {
////        int range = (max - min) + 1;
////        return (int)(Math.random() * range) + min;
////    }
////
////    public static void rollDiceGame(Scanner sc) {
////        String userChoice;
////        System.out.print("Please enter the number of sides for the dice: ");
////        int nSides = getInteger(1, 20);
////        do {
////            System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
////            do {
////                System.out.println("Would you like to roll again? [y/n]");
////                userChoice = sc.next().trim();
////            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//
//        } while (!userChoice.equals("n"));


//============================== # 4 ====================================



//============================================================================================================






//============================================================================================================



}