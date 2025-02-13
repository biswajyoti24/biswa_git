package programming;
class subArrayprogramme {
    public static void maxSubArray(int[] nums) {
        int n=nums.length;
        int sum = 0;
        int prev = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum=0;
                for(int k = i;k<=j;k++){
                    sum = sum+nums[k];
                    System.out.print(nums[k]+" ");
                }
                System.out.println("" + sum);
                if(sum>prev){
                    sum = sum+prev;
                    prev= sum-prev;
                    sum= sum-prev;
                }
            }

        }
        System.out.println("max sum is :"+ prev);

    }
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(arr);
    }
}