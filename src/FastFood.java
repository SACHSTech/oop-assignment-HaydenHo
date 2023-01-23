class FastFood extends Food {
    private Menu menu;

    // constructor for FastFood class
    public FastFood(String name, double price, String ingredients) {
        // call the super class constructor
        super(name, price, ingredients);
        // instantiate the menu object
        menu = new Menu();
    }
    // method to add food to menu
    public void addFoodToMenu(Food food) {
        menu.addFoodToMenu(food);
    }
    // method to remove food from menu
    public void removeFoodFromMenu(Food food) {
        menu.removeFoodFromMenu(food);
    }
    // method to find food in menu by name
    public Food findFoodInMenu(String foodName) {
        return menu.findFoodInMenu(foodName);
    }
    // method to print the menu
    public void printMenu() {
        menu.printMenu();
    }
    // method to cook the food
    public void cook() {
        System.out.println("Cooking "+ getName());
    }
}
