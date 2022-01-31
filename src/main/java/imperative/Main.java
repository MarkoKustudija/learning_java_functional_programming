package imperative;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(

                new Person("John",Gender.MALE),
                new Person("Tom", Gender.MALE),
                new Person("Ana", FEMALE),
                new Person("Tara", FEMALE),
                new Person("Alice", FEMALE)
        );

        System.out.println("Imperative approach  - a lot of code! : ");

        /** Imperative approach  - a lot of code!
         * We are taking care of every single detail. */

        /** List of females */
        List<Person>females = new ArrayList<>();

        for (Person person: people ) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for(Person female : females){
            System.out.println(female);
        }

        /** List of males */
        List<Person> males = new ArrayList<>();

        for (Person person: people ) {
            if (Gender.MALE.equals(person.gender)) {
                males.add(person);
            }
        }

        for(Person male : males){
            System.out.println(male);
        }


        System.out.println();

        /** Declarative approach
         * Using streams with collections.
         * stream is letting us go to abstract mode */

        System.out.println("Declarative approach -> less code : ");

       people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        List<Person> males2 = people.stream()
               .filter(person -> MALE.equals(person.gender))
               .collect(Collectors.toList());
                males2.forEach(System.out::println);

    }

    /**           Static class Person                 */

        static class Person {
            private final String name;
            private  final Gender gender;

            Person(String name, Gender gender) {
                this.name = name;
                this.gender = gender;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", gender=" + gender +
                        '}';
            }
        }

        enum  Gender{
        FEMALE, MALE
        }

    }

