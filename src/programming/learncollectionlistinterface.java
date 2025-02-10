package programming;

import java.util.Arrays;
import java.util.List;

public class learncollectionlistinterface {
    public static void main(String[] args)
    {
        Integer []numberss = {4,5,6,2,3,8,9};
//        List<Integer> numbers
//                = Arrays.asList(11, 22, 33, 44,
//                55, 66, 77, 88,
//                99, 100);
        List<Integer> numbers = Arrays.asList(numberss);

        // Internal iterator
        numbers.forEach(number
                -> System.out.print(
                number + " "));
    }
}
