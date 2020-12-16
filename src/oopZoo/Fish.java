package oopZoo;

public class Fish extends Animal{
    // A fish is a type of animal so it can extends the animal class

    //constructor that matches the animal one
    public Fish(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }

    @Override
    public void move() {
        System.out.println("flipping my fins");
    }

    public void swim(){
        System.out.println("Swimming...");

    }
}
