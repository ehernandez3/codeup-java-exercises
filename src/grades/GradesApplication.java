package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        Student s1 = new Student("Ryan");
        Student s2 = new Student("Zach");
        Student s3 = new Student("Justin");
        Student s4 = new Student("Fernando");

        HashMap<String, String> students = new HashMap<>();
        students.put("zgulde", s1.getName());
        students.put("zgulde", s2.getName());
        students.put("zgulde", s3.getName());
        students.put("zgulde", s4.getName());


//            HashMap<String, String> usernames = new HashMap<>();
//            usernames.put("Ryan", "ryanorsinger");
//            usernames.put("Luis", "MontealegreLuis");
//            usernames.put("Zach", "zgulde");
//            usernames.put("Fernando", "fmendozaro");
//            usernames.put("Justin", "jreich5");
    }
}
