package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int sides){
        this.length = sides;
        this.width = sides;
    }
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){

    }

    public int getArea(){
        int area = this.length * this.width;
        return area;
    }

    public int getPerimeter(){
        int perimeter = 2 * this.length + 2 * this.width;
        return perimeter;
    }


}


