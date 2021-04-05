package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionWLambdas {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 40),
                new Person("Charles2", "Caroll", 41),
                new Person("Charles3", "Brandice", 42),
                new Person("Charles4", "Misrules", 43),
                new Person("Charles5", "Cedric", 44)
        );

        // Step 1 sort list by last name
        Collections.sort(people, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));

        // step 2 Create a method that prints all the elements in the list
        printConditionally(people, p->true);


        // step 3 Create a method that prints all people that have last name beginning with C
        printConditionally(people, p -> p.getLastName().startsWith("C"));
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }

}
