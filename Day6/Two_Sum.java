public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++){
             if(nums[i]+nums[j]==target){
                 System.gc();
                 return new int[]{i,j};
             }
         }
        }
         return null;
     }
     public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int ans[]=twoSum(nums,9);
        System.out.println("Sum of two array element and it's index is :");
        for(int i:ans){
            System.out.print(i+" ");
        }
     }
}
