package programming;

public class medianTwoSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c = nums1.length+nums2.length;
        int[] mergearr = new int[c];
        int h=0;
        for (int i =0;i<c;i++){
            if(i<nums1.length){
                mergearr[i]= nums1[i];
            }else{
                mergearr[i]=nums2[h];
                h++;
            }

        }
        int temp = 0;
        double median = 0.0;
        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++){
                if(mergearr[i]>mergearr[j]){
                    temp = mergearr[j];
                    mergearr[j]=mergearr[i];
                    mergearr[i]=temp;
                }

            }

        }
        if(c%2==0){
            int k = c/2;
            int l = mergearr[k]+mergearr[k-1];
            median=l/2.0;
            System.out.println(median);
        }else{
            int k = (c-1)/2;
            median = mergearr[k];
        }

        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3}; int[] nums2 = {2};
        double d = findMedianSortedArrays(nums1,nums2);
        System.out.println("median value is :"+ d);
    }
}
