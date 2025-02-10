package programming;

import java.util.Arrays;
import java.util.List;

public class averageAgeofalistofPerson {

    public  static  void  main (String[] args){
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        double averageAge = persons.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println("average age is :"+ averageAge);

    }
}
