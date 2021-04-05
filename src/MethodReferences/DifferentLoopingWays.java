package MethodReferences;

import LambdaExpressions.Person;

import java.util.Arrays;
import java.util.List;

public class DifferentLoopingWays {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 40),
                new Person("Charles2", "Caroll", 41),
                new Person("Charles3", "Brandice", 42),
                new Person("Charles4", "Misrules", 43),
                new Person("Charles5", "Cedric", 44)
        );

        // for loop
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        //for each loop\
        System.out.println("________________________________________");
        for (Person p: people) {
            System.out.println(p);
        }

        // using lambda for each
        System.out.println("________________________________________");
        people.forEach(p-> System.out.println(p));
        // even shorter
        System.out.println("________________________________________");
        people.forEach(System.out::println);




    }
}
