package javacollectionstreams.javagenerics;
interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }
}

class Meal<T extends MealPlan> {
    T meal;
    Meal(T meal) {
        this.meal = meal;
    }
}

class MealGenerator {
    static <T extends MealPlan> T generateMeal(T meal) {
        return meal;
    }
}

public class MealPlanGenerator {
    public static void main(String[] args) {
        VegetarianMeal meal = MealGenerator.generateMeal(new VegetarianMeal());
        System.out.println(meal.getMealType());
    }
}

