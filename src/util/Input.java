package util;
import java.util.Scanner;

class OutOfRangeException extends Exception {}

public class Input {
    private Scanner sc = new Scanner(System.in);


    public String getString() {
            return this.sc.nextLine();
        }


    public boolean yesNo() {
        String userInput = getString();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
//        return (answer.equals("yes") || answer.equals("y"));
    }


//    int getInt()
    public int getInt() {
        System.out.println("Please input an integer");
        int userInput;
        try {
            userInput = Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("That is not a valid integer");
            userInput = getInt();
        }
        return userInput;
    }


//    int getInt(int min, int max)
    public int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max);
        int userInput;
        try {
            userInput = Integer.valueOf(getString());
            if (userInput < min || userInput > max)
                throw new OutOfRangeException();
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer");
            userInput = getInt(min, max);
        } catch (OutOfRangeException e) {
            System.out.println("Input is not in range");
            userInput = getInt(min, max);
        }
        return userInput;
    }


    //    double getDouble()
    public double getDouble() {
        System.out.println("Please input an integer");
        double userInput;
        try {
            userInput = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("That is not a valid integer");
            userInput = getDouble();
        }
        return userInput;
//        System.out.println("Enter a number");
//        double num = this.sc.nextDouble();
//        return num;

    }


//    double getDouble(double min, double max)
    public double getDouble(double min, double max) {
        System.out.println("Please input an integer between " + min + " and " + max);
        double userInput;
        try {
            userInput = Double.valueOf(getString());
            if (userInput < min || userInput > max)
                throw new OutOfRangeException();
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer");
            userInput = getDouble(min, max);
        } catch (OutOfRangeException e) {
            System.out.println("Input is not in range");
            userInput = getDouble(min, max);
        }
        return userInput;

    }


}
