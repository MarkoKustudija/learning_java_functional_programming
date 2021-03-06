package finalsection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Integer number = null;
        int counter = 12;
//        Function<String, String> upperCaseName = name -> {
//            // logic
//            if (name.isBlank()) throw new IllegalArgumentException("");
//            return name.toUpperCase();
//        };

        // String upperCasedName = upperCaseName.apply("John", 31);

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            // logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Tams", 31));
    }


}
