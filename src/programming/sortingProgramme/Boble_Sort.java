package programming.sortingProgramme;

public class Boble_Sort {
    public static int[] sort (int[] arr ){
        int sizeofarr = arr.length;
        for(int i = 0;i<sizeofarr-1;i++){
            for(int j = 0;j<sizeofarr-i-1;j++){
                if(arr[j]<arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }

        return arr;
    }
    public static void main(String []args){
        int[] array = {60,78,56,54,23,27,10,38};
        int[] arr = sort(array);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(" "+ arr[i]);
        }
    }
}
