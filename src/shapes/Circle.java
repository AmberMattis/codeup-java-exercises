package shapes;
import java.lang.Math;

public class Circle {
    private double radius;
    private static int circleCount = 0;

    public Circle(double userRadius){
        this.radius = userRadius;
        circleCount++;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2 * (Math.PI * radius);
    }

    public static int getCircleCount(){
        return circleCount;
    }
}
