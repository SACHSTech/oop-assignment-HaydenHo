import java.util.ArrayList;

class Order {
  private String customerName;
  private String customerAddress;
  private String customerPhone;
  private ArrayList<Food> foodList;

  public Order(String customerName, String customerAddress, String customerPhone) {
    this.customerName = customerName;
    this.customerAddress = customerAddress;
    this.customerPhone = customerPhone;
    this.foodList = new ArrayList<Food>();
  }

  public void addFoodToOrder(Food food) {
    foodList.add(food);
  }

  public void removeFoodFromOrder(Food food) {
    foodList.remove(food);
  }

  public double calculateTotalCost() {
    double totalCost = 0;
    for (Food food : foodList) {
      totalCost += food.getPrice();
    }
    return totalCost;
  }

  public void printOrderSummary() {
    System.out.println("Order summary:");
    System.out.println("Customer name: " + customerName);
    System.out.println("Customer address: " + customerAddress);
    System.out.println("Customer phone: " + customerPhone);
    System.out.println("Food items:");
    for (Food food : foodList) {
      System.out.println("- " + food.getName());
    }
    System.out.println("\n");
  }
}