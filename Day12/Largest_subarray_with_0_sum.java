import java.util.HashMap;

/**
 * Largest_subarray_with_0_sum
 */
public class Largest_subarray_with_0_sum {

    public static int maxLen(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                max = i + 1;
            } else {
                if (set.get(sum) != null) {
                    max = Math.max(max, i - set.get(sum));
                } else {
                    set.put(sum, i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23};
        int n = arr.length;
        System.out.println("Length of the longest subarray with 0 sum is " + maxLen(arr,n));
    }
}