package GroceryListApp;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addCategory(String category) {
        groceryList.add(category);
    }

    public void addItem(String foodItem){
        groceryList.add(foodItem);
    }
}


