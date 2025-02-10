package practice;

public class Practice2 {
    public static void main(String[] args) {
        int []Arr = {3,4,2,8,5,9};
        int firstHighest = Arr[0];
        int secondHighest = Integer.MIN_VALUE;
        int thirdHighest = Integer.MIN_VALUE;
        for(int i=1 ;i<Arr.length;i++){
            if(Arr[i]>firstHighest){
                thirdHighest=secondHighest;
                secondHighest=firstHighest;

                firstHighest = Arr[i];

            }else if(Arr[i]>secondHighest) {
                thirdHighest = secondHighest;
                secondHighest = Arr[i];

            }else if(Arr[i]>thirdHighest){
                thirdHighest =Arr[i];

            }
        }

        System.out.println("The third highest element is : "+ thirdHighest);

    }
}
