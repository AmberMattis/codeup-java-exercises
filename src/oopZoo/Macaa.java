package oopZoo;

public class Macaa extends Bird implements Flyable{

    public Macaa(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }

    @Override
    public void fly() {
        System.out.println("Macaw flying high");
    }

}
