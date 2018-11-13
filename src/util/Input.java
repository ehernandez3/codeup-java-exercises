package util;
import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

//    String getString()
    public String getString() {
            return this.sc.nextLine();
        }

//    boolean yesNo()
    public boolean yesNo() {
        String userInput = getString();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
//        return (answer.equals("yes") || answer.equals("y"));
    }

//    int getInt(int min, int max)
    public int getInt(int min, int max) {
        System.out.println("Enter a number that falls within the min and max: ");
        int userInput = this.sc.nextInt();
        if(userInput >= min && userInput <= max) {
                System.out.println("You're within range!");
                return userInput;
            } else {
                System.out.println("Sorry, try again.");
                return getInt(min, max);
            }
    }
//    int getInt()
    public int getInt() {
        System.out.println("Enter a number");
        int num = this.sc.nextInt();
        return num;

    }
//    double getDouble(double min, double max)
public double getDouble(double min, double max) {
    System.out.println("Enter a number that falls within the min and max: ");
    double userInput = this.sc.nextDouble();
    if(userInput >= min && userInput <= max) {
        System.out.println("You're within range!");
        return userInput;
    } else {
        System.out.println("Sorry, try again.");
        return getDouble(min, max);
    }
}
//    double getDouble()
public double getDouble() {
    System.out.println("Enter a number");
    double num = this.sc.nextDouble();
    return num;

}

}
