package inheritancePolymorphLec;

public class Developer extends Employee{

    //You need to have an empty constructor in order to get constructor from the PArent class or you could put super(name)

    public Developer(){
    }

    //created this constructor in order to use the doWork method on John
    //This constructor uses super to get the name from the Employess constuctor in the employees class

    public Developer(String name){
        super(name);
    }

    public static void main(String[] args) {
        Employee Bob = new Employee("Bob");
        Bob.doWork();
        System.out.println(Bob.getName());

        Developer John = new Developer("John");
        John.doWork();
        System.out.println(John.getName());
    }
}
