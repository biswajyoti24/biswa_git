package programming;

public class Test10 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");

            }
            for(int j=0; j<2*(n-i)-2;j++){
                System.out.print("-");
            }
            for(int j=0; j<=i;j++){
                System.out.print("*");

            }
            System.out.print(" // "+(2*(n-i)-2)+" spaces");
            System.out.println("");
        }
    }
}
