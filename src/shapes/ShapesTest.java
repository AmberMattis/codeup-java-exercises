package shapes;

public class ShapesTest {


    public static void main(String[] args){
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Square box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape = new Square(5);
        Measurable myOtherShape = new Rectangle(6,4);



        System.out.println("Square");
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter() + "\n");
        //System.out.println(myShape.getLength());

        System.out.println("Rectangle");
        System.out.println(myOtherShape.getPerimeter());
        System.out.println(myOtherShape.getArea());

    }



}
