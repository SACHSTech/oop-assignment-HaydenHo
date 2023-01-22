class FastFood extends Food {
    private Menu menu;

    public FastFood(String name, double price, String ingredients) {
        super(name, price, ingredients);
        menu = new Menu();
    }
    public void addFoodToMenu(Food food) {
        menu.addFoodToMenu(food);
    }
    public void removeFoodFromMenu(Food food) {
        menu.removeFoodFromMenu(food);
    }
    public Food findFoodInMenu(String foodName) {
        return menu.findFoodInMenu(foodName);
    }
    public void printMenu() {
        menu.printMenu();
    }
    public void cook() {
        System.out.println("Cooking FastFood");
    }
}