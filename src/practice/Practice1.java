package practice;

public class Practice1 {

    public static void main(String[] args){
        int [] arr = { 1,4,6,9,8,1 };

        for(int i=0;i<arr.length-1;i++)

        {

            for(int j=i;j<arr.length-1;j++)

            {

                if(arr[i]+arr[j] == 10){

                    System.out.println("Sum of "+arr[i]+" "+arr[j] +" = 10" );

                }

            }

        }

    }


}
