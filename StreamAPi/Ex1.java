package StreamAPi;

import StreamAPi.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {
        List<Dish> menu = List.of(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
        //Req-: Find Low calorie dishes names in asc order ( < 400 calories)
        List<String> lowCalorieDishes= menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted((d1, d2) -> d1.getCalories()- d2.getCalories())
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println(lowCalorieDishes);
    }
}