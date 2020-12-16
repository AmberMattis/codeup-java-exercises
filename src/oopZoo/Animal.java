package oopZoo;

public abstract class Animal {
    //Make some properties and methods that are general across the animal kingdom
    // want protected properties to extend the animal
    protected int age;

    protected String gender;

    protected int weightInPounds;

    //we need this constructor to create whatever type of animal we want
    public Animal(int age, String gender, int weightInPounds) {
        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
    }


   public abstract void move();
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

}


