public class Maximum_Product_Subarray_in_an_Array {
    public static int maxProduct(int[] nums) {
        int n=nums.length;
        int pref=0,suff=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pref==0)pref=1;
            if(suff==0)suff=1;
            pref*=nums[i];
            suff*=nums[n-1-i];
            ans=Math.max(ans,Math.max(pref,suff));
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
}
