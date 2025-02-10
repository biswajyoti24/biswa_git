package programming;
public class fibonicySeries {

    public static void main(String []args){
        System.out.println("Printing fibonicy series");
        printingFibiniciSeries(5);
    }

    public static void printingFibiniciSeries(int i) {
        int first = 0;
        int second = 1;
        if(i <= 0){
            System.out.println("hgjdfhdhgs");
        }
        if(i ==1){
            System.out.print(": "+first);
        }
        if(i ==2){
            System.out.print(": "+first +" "+second);
        }
        if(i >2){
            System.out.print(": "+first);
            for(int j=0;j<i;j++){
                int curr = first+second;
                first=second;
                second = curr;
                System.out.print(" "+first);
            }

        }

    }
}