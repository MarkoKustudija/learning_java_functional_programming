package streams;

import imperative.Main;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;


public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(

                new Person("John", MALE),
                new Person("Tom", MALE),
                new Person("Ana", FEMALE),
                new Person("Tara", FEMALE),
                new Person("Alice", FEMALE)
        );

//        people.stream()
//                .map(person -> person.gender)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(name -> name.length())
//                .forEach(System.out::println);

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(name -> name.length())
//                .forEach(x -> System.out.println(x));
//    }

        final Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        final boolean containsOnlyFemales = people.stream()
//                .allMatch(personPredicate);
//                  .anyMatch(personPredicate);
                    .noneMatch(personPredicate);

        System.out.println(containsOnlyFemales);


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

