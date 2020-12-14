package shapes;


public class Square extends Rectangle {
    public Square(){
    }

    public Square(int sides){
        super(sides);
    }

    public int getArea(int sides){
        int area = sides ^ 2;
        return area;
    }

    public int getPerimeter(int sides){
        int perimeter = 4 * sides;
        return perimeter;
    }

}
