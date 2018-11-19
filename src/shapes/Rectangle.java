package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void set_length(double _length) {
        this._length = _length;
    }

    public double get_length() {
        return this._length;
    }

    @Override
    public void set_width(double _width) {
        this._width = _width;
    }

    @Override
    public double getPerimeter() {
        return (2 * this._length) + (2 * this._width);
    }

    @Override
    public double getArea() {
        return (this._length * this._width);
    }


//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) { // "accepts" this: (double length, double width)
//        this.length = length; // "sets" this
//        this.width = width; // "sets" this
//    }
//
//    public double getArea() { // Don't need to pass anything in here, but is best practice to control your data
//        System.out.println("In Rectangle");
//        return (this.length * this.width);
//    }
//
//    public double getPerimeter() {
//        System.out.println("In Rectangle");
//        return (2 * this.length) + (2 * this.width);
//    }


}
