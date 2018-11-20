package grades;
import util.Input;

//import java.util.Scanner;
import java.security.Key;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input sc = new Input();
//        Input userInput = sc.getString();
//        HashMap<String, Student> students = new HashMap<>();
        HashMap<String, Student> students = getStudents();



        System.out.println(welcomeMessage());
        System.out.println(userList());
        userPrompts(sc, students);


//        System.out.println("Here are the github usernames of our students:");
//        System.out.println(students.get());

    }



    public static HashMap<String, Student> getStudents() {

        HashMap<String, Student> students = new HashMap<>();
        Student s1 = new Student("Ryan");
        Student s2 = new Student("Zach");
        Student s3 = new Student("Justin");
        Student s4 = new Student("Fernando");

        s1.addGrade(98);
        s1.addGrade(86);
        s1.addGrade(91);

        s2.addGrade(73);
        s2.addGrade(58);
        s2.addGrade(92);

        s3.addGrade(74);
        s3.addGrade(79);
        s3.addGrade(88);

        s4.addGrade(89);
        s4.addGrade(94);
        s4.addGrade(75);

        students.put("ryanorsinger", s1);
        students.put("zgulde", s2);
        students.put("jreich5", s3);
        students.put("fmendozaro", s4);

        return students;
    }
    public static String welcomeMessage(){
        return "Welcome!";
    }
    public static String userList() {
        return "Here are the github usernames of our students:\n\n" +
                getStudents().keySet();
    }



    private static void userPrompts(Input sc,  HashMap<String, Student> students) {
        System.out.println("\nWhat student would you like to see more information on?");
        String userInput = sc.getString();
        if (getStudents().containsKey(userInput)) {
            System.out.println("Name: " + students.get(userInput).getName() +
                    " - Gihub Username: " + userInput);
            System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
        } else if (!students.containsKey(userInput)) {
            System.out.println("Sorry, no student found with the gihub username of \"" + userInput + "\".");
            System.out.println("Would you like to see another student?");
            String userInput2 = sc.getString();
            if (userInput2.equalsIgnoreCase("yes") || userInput2.equalsIgnoreCase("y")) {
                userPrompts(sc, students);
            }
        }

    }


//    public static String getKey(){
//        for (String student : ) {}
//    }

}
