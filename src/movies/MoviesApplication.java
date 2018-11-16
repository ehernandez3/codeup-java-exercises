package movies;
import util.Input;

import java.util.Scanner;

public class MoviesApplication {
//    private Scanner sc = new Scanner(System.in);
    public static void main(String[] arg ) {
    Input userInput = new Input();


        System.out.println(userPrompts());
        userInput.getInt(0,5);
//        System.out.println(MoviesArray.findAll());

    }

    public static String userPrompts(){
        return
        "What would you like to do?\n\n" +
        "0 - exit\n" +
        "1 - view all movies\n" +
        "2 - view movies in the animated category\n" +
        "3 - view movies in the drama category\n" +
        "4 - view movies in the horror category\n" +
        "5 - view movies in the scifi category\n\n" +
        "Enter your choice: ";
    }

//    public static MoviesArray[] newArrOfMovies() {
//        Array.
//        MoviesArray.findAll()
//    }

//      public static Person[] addPerson(Person[] personArr, Person person) {
//          Person[] newPersonArray = Arrays.copyOf(personArr, personArr.length + 1);
//          newPersonArray[newPersonArray.length -1] = person;
//          return newPersonArray;
//
//      }

//      -Create a class named MoviesApplication that has a main method.

//      -Give the user a list of options for viewing all the movies or viewing movies by category.

//      -Use your Input class to get input from the user, and display information based on their choice.

//       (Remember to import your Input class)

//      -If a category is selected, only movies from that category should be displayed.
//      -Your application should continue to run until the user chooses to exit.
//    Sample Output:

//    What would you like to do?
//
//    0 - exit
//    1 - view all movies
//    2 - view movies in the animated category
//    3 - view movies in the drama category
//    4 - view movies in the horror category
//    5 - view movies in the scifi category
//
//    Enter your choice: 1
//
//    Frankenstein -- horror
//    Goodfellas -- drama
//    Pulp Fiction -- drama
//    ...
}
