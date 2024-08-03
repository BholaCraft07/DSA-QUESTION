import java.util.HashMap;
import java.util.Map;

/**
 * Subarrays_with_XOR_K
 */
public class Subarrays_with_XOR_K {

    public static int subarraysXOR(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int xr = 0;
        Map<Integer, Integer> ans = new HashMap<>();
        ans.put(0, 1);
        for (int i = 0; i < n; i++) {
            xr = xr ^ nums[i];
            int x = xr ^ k;
            if (ans.containsKey(x)) {
                count += ans.get(x);
            }
            if (ans.containsKey(xr)) {
                ans.put(xr, ans.get(xr) + 1);
            } else {
                ans.put(xr, 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2};
        System.out.println(subarraysXOR(arr, 2));
    }
}