class OrganicFood extends Food {
    private boolean isOrganic;
    private Menu menu;

    public OrganicFood(String name, double price, String ingredients, boolean isOrganic) {
        super(name, price, ingredients);
        this.isOrganic = isOrganic;
        menu = new Menu();
    }
    public boolean getIsOrganic() {
        return isOrganic;
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
        System.out.println("Cooking "+ getName());
    }
    
}