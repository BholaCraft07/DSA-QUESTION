public class Minimum_in_Rotated_SortedArray {
    public static int findMin(int[] nums) {
        int start=0,end=nums.length-1,ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=nums[start])
            { 
                ans=Math.min(ans,nums[start]);
                // if(nums[mid])
                start=mid+1;
            }
            else{
            ans=Math.min(ans,nums[mid]);
            end=mid-1;
            } 
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
        
    }
}
