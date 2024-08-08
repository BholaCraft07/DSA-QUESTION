public class Search_Element_in_Rotated_Sorted_Array_II {
    public static boolean search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            
            //if target ==mid
            if(nums[mid]==target)return true;
            
            // ager starting ==mid==end 
            if(nums[start]==nums[mid] && nums[start]==nums[end]){
                end--;
                start++;
                continue;
            }
            //left array is sorted
            if(nums[mid]>=nums[start]){
                if(target>=nums[start] && target<=nums[mid]){
                    end=mid-1;
                }
                else start=mid+1;
            }
           else {
                if(target>=nums[mid] && target<=nums[end]){
                    start=mid+1;
                }
                else end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,4};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
