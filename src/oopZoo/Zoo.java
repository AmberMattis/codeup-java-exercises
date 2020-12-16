package oopZoo;

public class Zoo {

    //This is the entry point for out application
    //Every class has a default empty constructor

    public static void main(String[] args){

//        Animal animal1 = new Animal(12,"female",5);
//        animal1.eat();
//        animal1.sleep();

        Fish salmon = new Fish(3,"male",3);
        salmon.eat();
        salmon.sleep();
        salmon.swim();
        salmon.move();

        Bird bird1 = new Bird(1,"female",4);
        bird1.eat();
        bird1.sleep();
        //bird1.fly();
        bird1.move();

        Macaa bird3 = new Macaa(10, "male",6);
        bird3.eat();
        bird3.sleep();
        bird3.fly();
        bird3.move();


    }
}

