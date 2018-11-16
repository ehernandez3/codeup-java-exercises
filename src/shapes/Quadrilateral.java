package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
//public class Register extends ActionSupport implements ModelDriven
    protected double _length;
    protected double _width;

    public  Quadrilateral(double length, double width) {
        this._length = length;
        this._width = width;
    }

    public double get_length() {
        return this._length;
    }

    public double get_width() {
        return this._width;
    }

    public abstract void set_length(double _length);
    public abstract void set_width(double _width);
}
