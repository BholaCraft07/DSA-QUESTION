import java.util.*;
public class Maximum_Score_from_Subarray_Minimums {
    public static int pairWithMaxSum(List<Integer> arr) {
        // Your code goes herei
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=1;i<arr.size();i++){
            sum=arr.get(i)+arr.get(i-1);
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr={4, 3, 1, 5, 6};
        List<Integer> nums = new ArrayList<>();
        for (int num : arr) {
            nums.add(num);
        }
        System.out.println(pairWithMaxSum(nums));
    }
}
