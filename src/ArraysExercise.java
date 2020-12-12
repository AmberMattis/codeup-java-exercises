import java.util.Arrays;
public class ArraysExercise {

    public static Person addPerson(Person person){
        return person;

    }


    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);// souting this out will only show the unique id for the array not the values
        System.out.println(Arrays.toString(numbers));

        Person[] person = new Person[3];

        Person p1 = new Person("Amber");
        Person p2 = new Person("Andrea");
        Person p3 = new Person("Ashley");

        person[0] = p1;
        person[1] = p2;
        person[2] = p3;

        System.out.println(Arrays.toString(person));
        for (int i = 0; i < person.length; i += 1) {
            System.out.println(person[i].getName());
       }

        System.out.println(addPerson(p1));

    }
}
