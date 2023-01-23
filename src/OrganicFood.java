class OrganicFood extends Food {
    private boolean isOrganic; //indicates if the food is organic
    private Menu menu; // menu of the organic food

    // constructor for organic food
    public OrganicFood(String name, double price, String ingredients, boolean isOrganic) {
        super(name, price, ingredients);
        this.isOrganic = isOrganic;
        menu = new Menu();
    }

    // adds food to the menu
    public void addFoodToMenu(Food food) {
        menu.addFoodToMenu(food);
    }
    // removes food from the menu
    public void removeFoodFromMenu(Food food) {
        menu.removeFoodFromMenu(food);
    }
    // finds food in the menu
    public Food findFoodInMenu(String foodName) {
        return menu.findFoodInMenu(foodName);
    }
    // prints the menu
    public void printMenu() {
        menu.printMenu();
    }
    // method for cooking food
    public void cook() {
        System.out.println("Cooking "+ getName());
    }

    // getter for isOrganic variable
    public boolean isOrganic() {
        return isOrganic;
    }
    // setter for isOrganic variable
    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }
}
