package programming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChechNonrepeatingCharacterFromSring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

//        for (String c:ch)
//            ch.forEach(x-> x);
        Map<char[],Long> mp = Arrays.asList(str.toCharArray()).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(mp);

    }
}
