package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int userLength, int userWidth){
        this.length = userLength;
        this.width = userWidth;
    }

    public static int getArea(int length, int width){
        return length * width;
    }

    public static int getPerimeter(int length, int width){
        return (2 * length) + (2 * width);
    }

}


