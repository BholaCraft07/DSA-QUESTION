class Rearrange_Array_Elements_by_Sign{
    public static int[] rearrangeArray(int[] nums) {
        int evpos=0,oddpos=1;
        int ans[]=new int[nums.length];
        for(int i:nums){
            if(i>0){
                ans[evpos]=i;
                evpos+=2;
            }
            else{
                ans[oddpos]=i;
                oddpos+=2;
            }
            
            
        }
        System.gc();
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        int ans[]=rearrangeArray(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}