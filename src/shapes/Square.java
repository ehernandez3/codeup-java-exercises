package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void set_length(double length) {
        this._length = length;
        this._width = length;
    }

    @Override
    public void set_width(double width) {
         this._length = width;
         this._width = width;
    }

    @Override
    public double getPerimeter() {
        return (4 * this._length);
    }

    @Override
    public double getArea() {
        return Math.pow(this._length, 2);
    }

//    public Square(double side) {
//        super(side, side);
//    }
//
//
//    public double getArea() {
//        System.out.println("In Square");
//        return Math.pow(this.length, 2);
//    }
//
//    public double getPerimeter() {
//        System.out.println("In Square");
//        return (4 * this.length);
//    }



}
