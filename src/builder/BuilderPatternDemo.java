package builder;


public class BuilderPatternDemo {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal = mealBuilder.prepareRegMeal();
        System.out.println("Meal:");
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());

        Meal veggieMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veggie Meal:");
        veggieMeal.showItems();
        System.out.println("Total Cost: " + veggieMeal.getCost());
    }
}
