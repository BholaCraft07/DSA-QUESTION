public class Subarray_Sum_Equals_K {
    public static int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
        
    }
}
