package oopZoo;

public class BoaConstrictor extends Snake {

    public BoaConstrictor(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }

    public void constrict(){
        System.out.println("Constricting...Night Night");
    }
}
