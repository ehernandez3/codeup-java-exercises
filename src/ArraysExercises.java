import  java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] arg) {

//        1. Array Basics
//        Create a class inside of src named ArraysExercises.
//        Create a main method for this class to do your work
//
//        What happens when you run the following code?
//        Why is Arrays.toString necessary?
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//================ 1.
//        int[] numbers = {1, 2, 3, 4, 5};
//        String arrayOfNumbers = Arrays.toString(numbers);
//        System.out.println(arrayOfNumbers);
//===============================
//        Create an array that holds 3 Person objects.
//        Assign a new instance of the Person class to each element.
//        Iterate through the array and print out the name of each person in the array.
//================ 2.
            Person p1 = new Person("Tammy");
            Person p2 = new Person("Timmy");
            Person p3 = new Person("Tommy");


            Person[] people = new Person[3];
            people[0] = p1;
            people[1] = p2;
            people[2] = p3;

            for (int i = 0; i < people.length; i += 1) {
                System.out.println(people[i].getName());
            }

//            Person[] people = {p1, p2, p3};




            Person[] morePeople = addPerson(people, new Person("Jimbo"));
            System.out.println(Arrays.toString(morePeople));
            for (Person person : morePeople) {
                System.out.println(person.getName());
            }
    }
//===============================
//        Create a static method named addPerson. It should accept an
//        array of Person objects, as well as a single person object to
//        add to the passed array. It should return an array whose length
//        is 1 greater than the passed array, with the passed person object
//        at the end of the array.

        public static Person[] addPerson(Person[] personArr, Person person) {
            Person[] newPersonArray = Arrays.copyOf(personArr, personArr.length + 1);
            newPersonArray[newPersonArray.length -1] = person;
            return newPersonArray;

    }





}
