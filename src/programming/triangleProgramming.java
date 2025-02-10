package programming;

import java.util.Scanner;

public class triangleProgramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        for (int i = 1; i <= N; i++) {
            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 0; j < 2 * (N - i); j++) {
                System.out.print("_");
            }

            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
