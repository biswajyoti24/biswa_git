package programming;

public class subarrayprogramming1 {
    public static void main(String[] args) {
        int []arr = {3,8,9,6,5,4,7};
        int length = arr.length;
        System.out.println("Count of possible subarrays and subsequences using given length of Array");
        int n=5;
        int result=0;
        for(int k=0 ; k<length;k++){
            for(int i=0;i<length;i++){

                    int count = 0;
                    for(int j=k;j<=i;j++){
                        System.out.print(arr[j]+" ");
                        count++;

                    }
                if(count==4){
                    result = result+1;


                }


                System.out.println("");
            }
        }
        System.out.println("no of sub array of length "+ n+ " is : = "+result);

    }


}
