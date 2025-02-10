package programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class streamApiExample1 {

    public  static  void  main(String []args){
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> longestString = strings
                .stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(" The longest string is : "+ longestString.get());
    }

}
