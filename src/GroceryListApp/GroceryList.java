package GroceryListApp;
import java.util.Scanner;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addCategory(String category) {
        groceryList.add(category);
    }

    public void addItem(String foodItem) {
        groceryList.add(foodItem);
    }

    public ArrayList getList(){
        return groceryList;
    }



    public static void main(String[] args) {
        GroceryList todaysList = new GroceryList();
        System.out.println("Enter a grocery Item");
        Scanner scanner = new Scanner(System.in);


        todaysList.addItem(scanner.nextLine());
        System.out.println(todaysList.getList());


    }
}

