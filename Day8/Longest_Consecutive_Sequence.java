import java.util.Arrays;

public class Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int count=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            int d=nums[i]-nums[i-1];
            if(d==1) {count++;}
            else if(d==0){continue;}
            else {
                max=Math.max(max,count);
                count=1;
            }
        }
        max=Math.max(max,count);
        return max;
    }
    public static void main(String ar[]){
        int[] nums = {100, 4, 200, 1, 3,2};
        System.out.println(longestConsecutive(nums));
    }
}
