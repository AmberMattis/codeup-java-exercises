package oopZoo;

public class Zoo {

    //This is the entry point for out application
    //Every class has a default empty constructor

    public static void main(String[] args){

//        Animal animal1 = new Animal(12,"female",5);
//        animal1.eat();
//        animal1.sleep();
        System.out.println("Salmon \n");
        Fish salmon = new Fish(3,"male",3);
        salmon.eat();
        salmon.sleep();
        salmon.swim();
        salmon.move();
        System.out.println("\n\n");

        System.out.println("Bird 1 \n");
        Bird bird1 = new Bird(1,"female",4);
        bird1.eat();
        bird1.sleep();
        //bird1.fly();
        bird1.move();
        System.out.println("\n\n");

        System.out.println("Bird 3\n");
        Macaa bird3 = new Macaa(10, "male",6);
        bird3.eat();
        bird3.sleep();
        bird3.fly();
        bird3.move();
        System.out.println("\n");

        System.out.println("Python \n");
        Snake python = new Snake(2, "female", 28);
        python.eat();
        python.sleep();
        python.move();
        python.shed();


    }
}

