import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Create a food object
    Food pizza = new FastFood("Pizza", 15.99, "Dough, tomato sauce, cheese");
    Food burger = new FastFood("Burger", 12.99, "Beef patty, lettuce, tomato, cheese");
    Food sandwich = new FastFood("Sandwich", 8.99, "Bread, chicken, lettuce, mayo");
    OrganicFood organicPizza = new OrganicFood("Organic Pizza", 15.99, "Dough, tomato sauce, cheese, organic vegetables", true);
    OrganicFood organicBurger = new OrganicFood("Organic Burger", 12.99, "Organic beef patty, organic lettuce, tomato, cheese", true);
    OrganicFood organicSandwich = new OrganicFood("Organic Sandwich", 8.99, "Organic bread, organic chicken, organic lettuce, organic mayo", true);
    // Create a restaurant object
    FastFood mcdonalds = new FastFood("McDonalds", 0, "123 Main St");
    mcdonalds.addFoodToMenu(pizza);
    mcdonalds.addFoodToMenu(burger);
    mcdonalds.addFoodToMenu(sandwich);
    mcdonalds.addFoodToMenu(organicPizza);
    mcdonalds.addFoodToMenu(organicBurger);
    mcdonalds.addFoodToMenu(organicSandwich);
    // Print out the menu
    mcdonalds.printMenu();
    // Get customer information
    System.out.print("Enter customer name: ");
    String customerName = scanner.nextLine();
    System.out.print("Enter customer address: ");
    String customerAddress = scanner.nextLine();
    System.out.print("Enter customer phone: ");
    String customerPhone = scanner.nextLine();
    // Create an order
    Order order = new Order(customerName, customerAddress, customerPhone);
    // Allow user to add food to the order
    String addAnother = "y";
    while (addAnother.equalsIgnoreCase("y")) {
      System.out.print("Enter food item to add to order: ");
      String foodItem = scanner.nextLine();
      Food selectedFood = mcdonalds.findFoodInMenu(foodItem);
      if (selectedFood != null) {
        order.addFoodToOrder(selectedFood);
      } else {
        System.out.println("Sorry, that food item is not available.");
      }
      System.out.print("Add another item to order (y/n)? ");
      addAnother = scanner.nextLine();
    }
    // Print out the order summary
    order.printOrderSummary();
    // Print out the total cost of the order
    System.out.println("Total cost: $" + order.calculateTotalCost());
    pizza.cook();
    burger.cook();
    sandwich.cook();
    organicPizza.cook();
    organicBurger.cook();
    organicSandwich.cook();
    scanner.close();
  }


}