package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 40),
                new Person("Charles2", "Caroll", 41),
                new Person("Charles3", "Brandice", 42),
                new Person("Charles4", "Misrules", 43),
                new Person("Charles5", "Cedric", 44)
        );

                // Step 1 sort list by last name
                Collections.sort(people, new Comparator<Person>() {
                    @Override
                    public int compare(Person p1, Person p2) {
                        return p1.getLastName().compareTo(p2.getLastName());
                    }
                });

                // step 2 Create a method that prints all the elements in the list

                printAll(people);
                // step 3 Create a method that prints all people that have last name beginning with C
                printLastNameWithC(people);
    }

    private static void printLastNameWithC(List<Person> people) {
        for (Person p : people) {
            if(p.getLastName().startsWith("C")){
                System.out.println("******************************");
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }


}
