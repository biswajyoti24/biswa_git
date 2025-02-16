package programming;

public class TrianleStarTest1 {
    public static void main(String[] args) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        for(int i=9;i>0;i--){
            for(int j=0;j<9-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print(i);
            }
            System.out.println("");
        }

    }
}
