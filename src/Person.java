public class Person {
    private String name;
    // returns the person's name
    public String getName() {
        return this.name; //Explanation -
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.format("Hello, %s", this.name);
    }
    // The class should have a constructor that accepts a string value and
    // sets the person's name to the passed string.
    public Person(String name) { // CONSTRUCTOR
        this.name = name;
//        System.out.println("A person is being created!");
    }
//
//    Create a main method on the class that creates a new Person object and
//      tests the above methods.
    public static void main (String[] arg) {
//        Person p1 = new Person("Bob");
//        Person p2 = new Person("John");
//        System.out.println(p1.getName().equals(p2.getName()));
//        System.out.println(p1 == p2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        System.out.println(person1);
//        System.out.println(person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person1);
        System.out.println(person2);

//        System.out.println(p1.getName());
//        System.out.println(p2.getName());
    }




}
