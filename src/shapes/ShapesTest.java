package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myshape;
        myshape = new Rectangle(6, 4);
        ((Rectangle) myshape).set_length(5);
        System.out.println(myshape.getPerimeter());
        System.out.println(myshape.getArea());


        myshape = new Square(3);
        ((Square) myshape).set_length(5);
        System.out.println(myshape.getPerimeter());
        System.out.println(myshape.getArea());


        //variable of the type Rectangle named box1 and assign it a new
        // instance of the Rectangle class with a width of 4 and a length of 5
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());



    }

}
