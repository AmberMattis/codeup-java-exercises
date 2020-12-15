package shapes;


public class Square extends Quadrilateral {
    protected double length;
    protected double width;


    //Constructor

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    //Methods

    @Override
    double setLength() {
        return length ;
    }

    @Override
    double setWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length * 4);
    }

    //    public Square(){
//    }
//
//    public Square(int sides){
//        super(sides);
//    }
//
//    public int getArea(int sides){
//        int area = sides ^ 2;
//        return area;
//    }
//
//    public int getPerimeter(int sides){
//        int perimeter = 4 * sides;
//        return perimeter;
//    }

}
