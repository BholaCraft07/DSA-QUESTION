public class MajorityElement {
    public static int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int count=0;
        // int left=0,right=0;
        // while(right<nums.length){
        //     if(nums[left]==nums[right]){
        //         count++;
        //         right++;
        //     }
        //     else{
        //         left=right;
        //         count=0;
        //     }
        //     if(count>nums.length/2) return nums[left];
        // }
        // return -1;

         int n = nums.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println("Majority element it means sabse jayda aane wala element:"+majorityElement(arr));
        
    }
}
