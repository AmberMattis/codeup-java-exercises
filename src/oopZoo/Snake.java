package oopZoo;

public class Snake extends Animal{

    public Snake(int age, String gender, int weightInPounds){
       super(age,gender,weightInPounds);
    };

    @Override
    public void move() {
        System.out.println("Slithering along!!");
    }

    public void shed(){
        System.out.println("Shedding my skin...");
    }
}
