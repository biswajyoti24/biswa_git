package programming;

import java.util.Scanner;

public class armStrongNumber {

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a nubmber to check Armstrong Number : ");
//        int num = sc.nextInt();
//        System.out.println("Entered a nubmber to check Armstrong Number  is: "+num);
        for(int i=100; i<100000;i++){
            checkArmstrongNumber(i);
        }

    }

    private static void checkArmstrongNumber(int num) {
        int number = num;
        int digitcount = 0;
        while(number!=0){
            number=number/10;
            digitcount++;

        }
        number=num;
        double powSumDisgit = 0;
        while (number!=0){

            int n = number%10;
//            int j=1;
//            for(int i=0;i<digitcount;i++){
//                j = j*n;
//            }
//            powSumDisgit=powSumDisgit+j;
            powSumDisgit = powSumDisgit+Math.pow(n,digitcount);
            number=number/10;
        }
//        System.out.println("addition of power of digits: "+ powSumDisgit);
        if(powSumDisgit==num){
            System.out.println(num+" is an Armstrong Number");
        }
    }
}
