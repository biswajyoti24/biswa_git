package programming;

import java.util.Scanner;

public class JavaStringProgramming2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");
        for(String st : words)
        System.out.println(st);
    }
}
