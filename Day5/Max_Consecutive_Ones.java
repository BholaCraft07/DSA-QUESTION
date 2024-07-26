package Day5;
public class Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums){
        int count=0;
        int max=count;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)count++;
            else {
                count=0;
            }
            max=Math.max(max,count);
        }
         return max;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    
}