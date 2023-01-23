public abstract class Food {
    private String name;
    private double price;
    private String ingredients;
    
    // constructor for creating a food object with name, price, and ingredients
    public Food(String name, double price, String ingredients) {
        super();
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for price
    public double getPrice() {
        return price;
    }

    // setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // getter for ingredients
    public String getIngredients() {
        return ingredients;
    }

    // setter for ingredients
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    // abstract method for cooking the food
    public abstract void cook();
}
