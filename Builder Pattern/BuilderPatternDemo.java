public class BuilderPatternDemo {
    public static void main(String[] args) {
            
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.PrepeareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: "+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.PrepeareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: "+nonVegMeal.getCost());

    }
}
