package programming;
import java.util.Scanner;

public class DiamondProgramming2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n;i++){
            System.out.println("");
            for(int j =0; j<n-i;j++)
                System.out.print(" ");
            for(int j=0;j<2*i-1;j++){
                System.out.print(i);
            }
        }

        for(int i = n-1 ; i>0;i--){
            System.out.println("");
            for(int j =0; j<n-i;j++)
                System.out.print(" ");
            for(int j=0;j<2*i-1;j++){
                System.out.print(i);
            }
        }

    }

}
