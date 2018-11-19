package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
     }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        return Math.round(average);
    }

    public static void main(String[] arg) {

        Student s1 = new Student("Frank");
        Student s2 = new Student("Sam");
        Student s3 = new Student("Richard");

        s1.addGrade(98);
        s1.addGrade(86);
        s1.addGrade(91);

        s2.addGrade(73);
        s2.addGrade(58);
        s2.addGrade(92);

        s3.addGrade(74);
        s3.addGrade(79);
        s3.addGrade(88);

        System.out.println(s1.name + "\'s grade point average is: " + s1.getGradeAverage());
        System.out.println(s2.name + "\'s grade point average is: " + s2.getGradeAverage());
        System.out.println(s3.name + "\'s grade point average is: " + s3.getGradeAverage());



    }

}
