package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.zip.CheckedInputStream;

public class _Consumer {

    public static void main(String[] args) {

    Customer marija = new Customer(
            "Marija",
            "99999"
    );



        // Normal java function
        greetCustomer(marija);

        // Normal java function with 2 params
        greetCustomerV2(marija, false);

        // Consumer Functional Interface
        greetCustomerConsumer.accept(marija);

        // BiConsumer Functional Interface
        greetCustomerConsumerV2.accept(marija, true);



    }

    /** BiConsumer - takes 2 arg and return no result */

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for register whit your phone: " +
                    (showPhoneNumber ? customer.phoneNumber : "*******"));



    /** Consumer - takes 1 argument , return no result */

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for register whit your phone: " +
                    customer.phoneNumber);

    // classic java function
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName +
                ", thanks for register whit your phone: " +
                customer.phoneNumber);

    }
    // classic java function with 2 parameters
    static void greetCustomerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName +
                ", thanks for register whit your phone: " +
                (showPhoneNumber ? customer.phoneNumber : "*******"));

    }

    static class Customer{
        private final String customerName;
        private final String phoneNumber;

        Customer(String customerName, String phoneNumber) {
            this.customerName = customerName;
            this.phoneNumber = phoneNumber;
        }
    }


}
