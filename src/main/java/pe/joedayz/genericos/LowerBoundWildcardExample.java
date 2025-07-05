package pe.joedayz.genericos;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardExample {


    public static void addFoodToFoods(List<Food> order, Food food) {
        order.add(food);
    }

    public static void addFoodToFoodParents(List<? super Food> order, Food food) {
        order.add(food);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        List<Food> foods = new ArrayList<>();
        Food f = new Food("Cake", 2.99);


        addFoodToFoods(foods, f); //match

        //addFoodToFoods(products, f);


        addFoodToFoodParents(foods, f);
        addFoodToFoodParents(products, f);
    }

}
