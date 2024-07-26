package Day5;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==num){
                    count++;
                }
            }
            if(count==1){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
}
