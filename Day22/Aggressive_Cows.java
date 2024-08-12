import java.util.Arrays;

/**
 * Aggressive_Cows
 */
public class Aggressive_Cows {
    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1, high = stalls[n - 1] - stalls[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(stalls, mid, k) == true) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return high;
    }

    public static boolean canWePlace(int[] stalls, int dist, int cows) {
        int n = stalls.length; // size of array
        int cntCows = 1; // no. of cows placed
        int last = stalls[0]; // position of last placed cow.
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++; // place next cow.
                last = stalls[i]; // update the last location.
            }
            if (cntCows >= cows)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] stalls = {0,3,4,7,10,9};
        System.out.println(aggressiveCows(stalls,4));
    }

}