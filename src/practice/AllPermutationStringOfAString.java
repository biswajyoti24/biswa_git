package practice;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationStringOfAString {
    //Write a program to print all permutations of String in Java.
    public static void main(String[] args) {
        String s = "abcdef";
        List<String> possiblePermutitionString = getPossiblePermutitionString(s);
        for (String str : possiblePermutitionString)
            System.out.println(str);
    }
    private static String insertCharAt(String word, char c, int position) {
        String start = word.substring(0, position);
        String end = word.substring(position);
        return start + c + end;
    }

    public static List<String> getPossiblePermutitionString(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            result.add("");
            return result;
        }
        char firstChar = str.charAt(0);
        String remainingStr = str.substring(1);
        List<String> words = getPossiblePermutitionString(remainingStr);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                result.add(insertCharAt(word, firstChar, i));
            }
        }
        return result;
    }

}
