package programming;

import java.util.Scanner;

public class DiamondProgramming {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N= 6;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = N - 1; i >= 1; i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
