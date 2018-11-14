package PracticeBonuses;
import java.util.Scanner;

public class UserTest {
    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.println("What is the user's age?");
        int userInput = scanner.nextInt();
        user.setAge(userInput);
        System.out.println(user.getAge());
//        System.out.println(user.getAge());

//        user.setAge() = scanner.nextInt();
//        System.out.println(user.setAge());

    }
}
