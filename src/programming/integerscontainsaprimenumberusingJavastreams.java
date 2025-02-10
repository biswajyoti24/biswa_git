package programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class integerscontainsaprimenumberusingJavastreams {

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private  void printPrime() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        boolean containsPrime = numbers.stream()
                .anyMatch(this::isPrime);
        System.out.println("List contains a prime number: " + containsPrime);
//        List<Integer> sortednumbers = numbers.stream().sorted().forEach(s -> System.out.println(s));

        System.out.println("Descending order");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
        System.out.println("Ascending order");
        numbers.stream().sorted(Comparator.naturalOrder()).forEach(s -> System.out.println(s));

    }
    public static void  main(String[] args){
        integerscontainsaprimenumberusingJavastreams integerscontainsaprimenumberusingJavastream = new integerscontainsaprimenumberusingJavastreams();
        integerscontainsaprimenumberusingJavastream.printPrime();

    }
}
