package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Initialize the array
        int[] array = {1, 2, 4, 4, 5, 6, 2, 3, 4, 3, 4, 6};

        // Initialize the map to keep track of frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate over each digit in the array
        for (int digit : array) {
            // Check if the digit is already in the map
            if (frequencyMap.containsKey(digit)) {
                // Increment the count by 1
                frequencyMap.put(digit, frequencyMap.get(digit) + 1);
            } else {
                // Add the digit to the map with a count of 1
                frequencyMap.put(digit, 1);
            }
        }

        // Print the frequency of each digit
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }

        Map<int[], Long> frequencyMap1 = Arrays.asList(array).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(frequencyMap1.get(4));
    }
}
