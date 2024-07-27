public class Sort_Colors {
    public static void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int t=nums[low];
                nums[low]=nums[mid];
                nums[mid]=t;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int t=nums[mid];
                nums[mid]=nums[high];
                nums[high]=t;
                high--;
            }
        }
         System.gc();

    }
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        System.out.println("sort this color :");
        System.out.println("Before :");
        for (int i : arr) {
            System.out.print(i+"  ");
        }
        System.out.println("\nAfter :");
        sortColors(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
