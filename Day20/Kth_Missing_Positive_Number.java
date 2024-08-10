public class Kth_Missing_Positive_Number {
    public static int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,7,11};
        System.out.println(findKthPositive(arr, 5));
    }
}
