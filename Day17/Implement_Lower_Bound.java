/**
 * Implement_Lower_Bound 
   link(https://www.naukri.com/code360/problems/lower-bound_8165382?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries&count=25&page=1&search=&sort_entity=order&sort_order=ASC)
 */
public class Implement_Lower_Bound {
    public static int lowerBound(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;
        while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]>=target){
                ans=arr[mid];
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // int arr[]={1,2,2,3,3,5};
        // int arr[]={1, 2, 4, 7};
        int arr[]={3, 4, 7, 8, 8, 10};
        // System.out.println("Lower index is "+lowerBound(arr, 0));//0 
        // System.out.println("Lower index is "+lowerBound(arr, 2));//1
        // System.out.println("Lower index is "+lowerBound(arr, 3));//3
        // System.out.println("Lower index is "+lowerBound(arr, 1));//6
        System.out.println("Lower index is "+lowerBound(arr, 5));//6



    }
}