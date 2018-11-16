package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }


    public double getArea() {
        System.out.println("In Square");
        return Math.pow(this.length, 2);
    }

    public double getPerimeter() {
        System.out.println("In Square");
        return (4 * this.length);
    }



}
