package programming;

import java.util.Scanner;

public class StringExample {
        public int lengthOfLongestSubstring(String s) {
            String result = "";
            String prev = "";
            int count = 0;
            for (int i = 0; i < s.length() - 1; i++) {

                for (int a = 0; a < s.length() - 1; a++) {
                    result="";
                    for (int k = i; k < s.length() - 1; k++) {
                        result = result + s.charAt(k);

                    }
                    System.out.print(result);

//                    for (int j = 0; j < result.length() - 1; j++) {
//                        count = 0;
//                        for (int k = 0; k < result.length() - 1; k++) {
//                            if (result.charAt(j) == result.charAt(k))
//                                count++;
//
//                            if (count <= 1) {
//
//                                if (prev.length() <= result.length()) {
//                                    prev = result;
//                                }
//
//                            }
//
//                        }
//                    }

                    System.out.println("");
                }

            }
            return prev.length();
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringExample se = new StringExample();
        int n = se.lengthOfLongestSubstring(str);
        System.out.println("lenth : "+ n);
    }
}
