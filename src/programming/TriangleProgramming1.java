package programming;

import java.util.Scanner;

public class TriangleProgramming1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){

            for(int j =1;j<=i;j++)
                System.out.print("*");
            for (int j=i+1;j<=2*n-i;j++)
                System.out.print("_");
            for(int j =n-i;j<n;j++)
                System.out.print("*");

            System.out.println("");
        }
    }

}
