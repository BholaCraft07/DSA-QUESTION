import java.util.HashMap;

/**
 * Longest_SubArray_WithSum_K
 */
public class Longest_SubArray_WithSum_K {
    public static int lenOfLongSubarr (int A[], int N, int K) {
      HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];

            if (sum == K) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - K)) {
                maxLen = Math.max(maxLen, i - map.get(sum - K));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
        
}
public static void main(String[] args) {
    int[] a = {2, 3, 5, 1, 9};
    int k = 10;
    int len = lenOfLongSubarr(a,a.length,k);
    System.out.println("The length of the longest subarray is: " + len);
}
}