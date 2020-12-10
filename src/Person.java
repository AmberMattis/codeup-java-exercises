public class Person {
    private String name;

    public Person(String personName){
        this.name = personName;
    }

    public String getName(){
        return "name: " + name;
    }

    public String setName(String inputName) {
        this.name = inputName;
        return name;


    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }



    public static void main(String [] args){
        Person p1 = new Person("Amber");
        Person p2 = p1;

        System.out.println(p1.getName());
        p1.sayHello();
        System.out.println(p1.setName("Anderson"));

//        System.out.println(p1.getName().equals(p2.getName()));
//        System.out.println(p1 == p2);

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        p2.setName("Jane");
        System.out.println(p1.getName());
        System.out.println(p2.getName());


    }

}
