import java.time.Duration;
import java.util.ArrayList;

public class MakeJava {

    public static void main(String[] args) {
        ArrayList<Ingredient> vessel = new ArrayList<>();

        ArrayList<Ingredient> ingredientsGiven = new ArrayList<>();
        ingredientsGiven.add(new Ingredient("ragi malt", Duration.ofSeconds(1800)));
        ingredientsGiven.add(new Ingredient("water", Duration.ofSeconds(1800)));
        ingredientsGiven.add(new Ingredient("water", Duration.ofSeconds(1800)));

        vessel.addAll(ingredientsGiven);

        MakeJava mj = new MakeJava();
        String result = mj.cook(vessel);
        System.out.println(result);
    }

    public String cook(ArrayList<Ingredient> vessel) {
        Duration maxDuration = Duration.ZERO;

        for (Ingredient ingredient : vessel) {
            if (ingredient.heatingTime.compareTo(maxDuration) > 0) {
                maxDuration = ingredient.heatingTime;
            }
        }

        try {
            System.out.println("Cooking for " + maxDuration.getSeconds() + " seconds...");
            Thread.sleep(maxDuration.toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Java cooked!";
    }

    public static class Ingredient {
        String name;
        Duration heatingTime;

        public Ingredient(String name, Duration heatingTime) {
            this.name = name;
            this.heatingTime = heatingTime;
        }
    }
}
