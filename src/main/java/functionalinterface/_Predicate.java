package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

/** Represents a predicate (boolean-valued function) of one argument. */

public static void main(String[] args) {

        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("070000"));
        System.out.println(isPhoneNumberValid("0701"));
        System.out.println(isPhoneNumberValid("550055"));
        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("070000"));
        System.out.println(isPhoneNumberValidPredicate.test("0701"));
        System.out.println(isPhoneNumberValidPredicate.test("550055"));
        System.out.println("Chaining predicates");
        System.out.println(isPhoneNumberValidPredicate
            .and(containNumber3).test("070000"));
        System.out.println(isPhoneNumberValidPredicate
            .and(containNumber3).test("070703"));
        System.out.println(isPhoneNumberValidPredicate
            .and(containNumber3).test("070703333"));



    }


    static boolean isPhoneNumberValid(String phoneNumber){
         return phoneNumber.startsWith("07") && phoneNumber.length() == 6;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber ->
                    phoneNumber.startsWith("07") && phoneNumber.length() == 6;

    static Predicate<String> containNumber3 = phoneNumber ->
            phoneNumber.contains("3");

}


