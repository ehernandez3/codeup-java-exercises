package shapes;
import  java.util.Scanner;
import util.Input;

public class CircleApp {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        Input in = new Input(sc);
        System.out.println("Please enter a radius length: ");
        double radius = in.getDouble();

        Circle c = new Circle(5);
        System.out.println(c.getCircumference());
        System.out.println(c.getArea());
    }
}
