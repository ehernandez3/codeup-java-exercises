package PracticeBonuses;

public class Notes {
    public static void main(String[] arg) {
//        System.out.println(returnThree());

    }
    private static int returnThree () {

        return 3;

    }

    protected int returnFive () {
        return returnThree() + 2;
    }

    // Static field
        // Example:
            // private static int ballCount;
        // static keyword is interchangeable with the positions of the visibility keywords
            // Example:
                // static private int ballCount;
            // But, most programmers tend to put the visibility keyword first
        // Value is same across all instances of the class
            // Example:
                // if a class has a static field named CompanyName, all objects created
                // from that class will have the same value for CompanyName

    // Static method
        // method has to be static if you plan on calling it from another method that is set to static
    // in order to be called within that class (main method inside that class)
        //

    // Public
}
