package combinatorpattern;


import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+03816457573939",
                LocalDate.of(2000, 1, 1)

        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        /** Using combinator pattern */

        final ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS)
            throw new IllegalStateException(result.name());

    }
}
