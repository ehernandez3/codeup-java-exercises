package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) { // "accepts" this: (double length, double width)
        this.length = length; // "sets" this
        this.width = width; // "sets" this
    }

    public double getArea() { // Don't need to pass anything in here, but is best practice to control your data
        System.out.println("In Rectangle");
        return (this.length * this.width);
    }

    public double getPerimeter() {
        System.out.println("In Rectangle");
        return (2 * this.length) + (2 * this.width);
    }

}
