package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;


    }

    @Override
    double setLength() {
        return length ;
    }

    @Override
    double setWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return length * width;
    }

    @Override
    public double getArea() {
        return (length * 2) + (width * 2);
    }

    //    protected int length;
//    protected int width;
//
//    public Rectangle(int sides){
//        this.length = sides;
//        this.width = sides;
//    }
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public Rectangle(){
//    }
//
//    public int getArea(){
//        int area = this.length * this.width;
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = 2 * this.length + 2 * this.width;
//        return perimeter;
//    }


}


