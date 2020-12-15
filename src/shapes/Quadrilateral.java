package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;


    //constructor
    public Quadrilateral(){
    }
    public  Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

     //Methods
     public double getLength(double length){
         return this.length;
        }

     public double getWidth(double width){
        return this.width;
     }

     abstract double setLength();
    abstract double setWidth();
}
