import java.util.ArrayList;

public class Menu {
    private ArrayList<Food> foodItems;

    public Menu() {
        this.foodItems = new ArrayList<Food>();
    }

    public void addFoodToMenu(Food food) {
        foodItems.add(food);
    }

    public void removeFoodFromMenu(Food food) {
        foodItems.remove(food);
    }

    public Food findFoodInMenu(String foodName) {
        for (Food food : foodItems) {
            if (food.getName().equalsIgnoreCase(foodName)) {
                return food;
            }
        }
        return null;
    }

    public void printMenu() {
        System.out.println("Menu:");
        for (Food food : foodItems) {
            System.out.println(food.getName() + " - $" + food.getPrice());
        }
    }
}