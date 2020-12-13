import java.util.Arrays;
public class ArraysExercise {


    public static Person[] addPerson(Person[] pplArray, Person personToAdd){
        Person[] tempArray = Arrays.copyOf(pplArray, pplArray.length+1);
        tempArray[tempArray.length-1] = personToAdd;
        return tempArray;
    }


    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(numbers);// souting this out will only show the unique id for the array not the values
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Amber");
        people[1] = new Person("Andrea");
        people[2] = new Person("Ashley");


//        System.out.println(Arrays.toString(people));
//        for (int i = 0; i < people.length; i += 1) {
//            System.out.println(people[i].getName());
//       }


        //This enhanced for loop takes in each people object in the array and
        for(Person person : people){
            System.out.println(person.getName());
        }

        Person[] newArray = addPerson(people, new Person("April"));

        for(Person person: newArray){
            System.out.println(person.getName());
        }



    }
}
