package oopZoo;

public class Kangaroo extends Animal {

    public Kangaroo(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }

    @Override
    public void move() {
        System.out.println("hopping around...");
    }
}

