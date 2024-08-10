public class Find_the_Smallest_Divisor_Give_na_Threshold {
    public static int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length; //size of numsay.
       if(n > threshold) return -1;
       //Find the maximum element:
       int maxi = Integer.MIN_VALUE;
       for (int i = 0; i < n; i++) {
           maxi = Math.max(maxi, nums[i]);
       }

       int low = 1, high = maxi;

       //Apply binary search:
       while (low <= high) {
           int mid = (low + high) / 2;
           if (sumByD(nums, mid) <= threshold) {
               high = mid - 1;
           } else {
               low = mid + 1;
           }
       }
       return low;
   }
   public static int sumByD(int[] arr, int div) {
       int n = arr.length; //size of array
       //Find the summation of division values:
       int sum = 0;
       for (int i = 0; i < n; i++) {
           sum += Math.ceil((double)(arr[i]) / (double)(div));
       }
       return sum;
   }
   public static void main(String[] args) {
    int arr[]={44,22,33,11,1};
    int threshold = 5;
    System.out.println(smallestDivisor(arr, threshold));
   }
}
