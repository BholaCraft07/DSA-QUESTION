public class Longest_Subarray_With_Sum_K_ForPositiveNumber {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
       int left=0,right=0;
	   long sum=a[0];
	   int maxLen=0;
	   int n=a.length;
	   while(right<n){
		   while(left<=right && sum>k){
			   sum-=a[left];
			   left++;
		   }
		   if(sum==k){
			   maxLen=Math.max(maxLen,right-left+1);
		   }
		   right++;
		   if(right<n) sum+=a[right];
	   }
	   return maxLen;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 1, 1, 1, 1};
        long k=3;
        System.out.println(longestSubarrayWithSumK(arr, k));
    }   
}
