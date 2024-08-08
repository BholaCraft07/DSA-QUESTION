public class Search_Element_in_a_Rotated_SortedArray {
    public static int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)return mid;
            //left array is sorted
            if(nums[mid]>=nums[start]){
                if(target>=nums[start] && target<=nums[mid]){
                    end=mid-1;
                }
                else start=mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target)); // Output: 4
    }
}
