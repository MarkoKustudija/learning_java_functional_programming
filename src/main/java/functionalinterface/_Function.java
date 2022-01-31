package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {


        //1. result - classic java function
        int increment = incrementByOne(0);
        System.out.println(increment);

     /** Function: take 1 arguments and produce 1 result */

     //2. result
       int increment2 =incrementByOneFunction.apply(1);
        System.out.println(increment2);

     //3. result
        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        final Function<Integer, Integer> addBy1AndThenMultiplyBy10
                = incrementByOneFunction.andThen(multiplyBy10Function);
     // 4. result
               System.out.println( addBy1AndThenMultiplyBy10.apply(9));
     // 5. result -classic java function
               System.out.println(
                       incrementByOneAndMultiply(4,100));
     // 6. result - BiFunction
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));

    }


   /** Function<T,R> */
   static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

   static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;


    /** BiFunction: take 2 arguments and produce 1 result */
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiply) ->
                    (numberToIncrementByOne + 1) * numberToMultiply;



    // classic java function with 2 arguments
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }


    // classic java function with 1 argument
    static int incrementByOne(int number){
        return number + 1;
    }
}
