package programming;

import java.util.Scanner;

public class arrayprogramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        findSubarray(arr);

    }

    private static void findSubarray(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int prec_sum =0 ;

            for(int i=0 ;i<n;i++){

                for(int j=0;j<n;j++) {
                    sum=0;
                    int previous =0;
                    for (int k = i; k <= j; k++) {
                        if(previous ==0){
                            previous = arr[k];
                            sum = sum + arr[k];
                        }

                        else if (previous+1 == arr[k]) {
                            sum = sum + arr[k];
                            previous=arr[k];
                        }else{
                            break;
                        }

                        System.out.print(arr[k] + " ");

                    }
                    System.out.println("");
                    if(sum>prec_sum)
                    {
                        sum = sum+prec_sum;
                        prec_sum = sum-prec_sum;
                        sum = sum-prec_sum;
                    }
//                for(int j =k;j<n;j++)
                }

            }

        System.out.println("maximum sum of sub array :"+ prec_sum);
    }
}
