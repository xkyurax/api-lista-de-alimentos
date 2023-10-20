package dev.dio.desafiofinaldio.entities;

public class Product {

    private Long id;
    private String name;
    private Double price;

    private FoodType foodType;

    public Product(){

    }

    public Product(Long id, String name, Double price, Long foodID, String foodName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.foodType = new FoodType(foodID, foodName);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }
}
