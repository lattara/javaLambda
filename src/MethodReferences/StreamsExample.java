package MethodReferences;
import LambdaExpressions.Person;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles1", "Dickens", 40),
                new Person("Charles2", "Caroll", 41),
                new Person("Charles3", "Brandice", 42),
                new Person("Charles4", "Misrules", 43),
                new Person("Charles5", "Cedric", 44)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p->System.out.println(p.getLastName()));

        long count = people.stream().filter(p -> p.getLastName().startsWith("A")).count();
        System.out.println("Count is " + count);

    }

}
