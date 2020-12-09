package oopLecture;

public class DishTest {

    public static void main(String[] arg){
    Dish dish1 = new Dish();
    dish1.nameOfDish = "And I OOP Pizza bites";
    dish1.costInCents = 500;
    dish1.wouldRecommend = true;

    Dish dish2 = new Dish();
    dish2.nameOfDish = "My mom's spaghetti";
    dish2.costInCents = 1000;
    dish2.wouldRecommend = true;




      //  System.out.println(dish1.nameOfDish);

        System.out.println(dish1.printSummary() + "\n");
        System.out.println(dish2.printSummary() + "\n");
        System.out.println(DishTools.shoutDishName(dish1) + "\n");
        System.out.println(DishTools.analyzeDishCost(dish1) + "\n");
        System.out.println(DishTools.flipRecommendation(dish1) + "\n");


    }

}
