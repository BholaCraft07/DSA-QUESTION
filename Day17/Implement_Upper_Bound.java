public class Implement_Upper_Bound {
    public static int UpperBound(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        // int ans=arr.length;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                ans=mid-1;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // int arr[]={1,5,5,7,7,9,10};
        // int arr[]={0,0,1,1,2,2,2,2};
        int arr[]={3, 4, 7, 8, 8, 10};

        // System.out.println("Upper Bound is  "+UpperBound(arr, 5));//3
        // System.out.println("Upper Bound is  "+UpperBound(arr, ));//3
        // System.out.println("Upper Bound is  "+UpperBound(arr, 2));//3
        System.out.println("Upper Bound is  "+UpperBound(arr, 5));//3
        // System.out.println("Upper Bound is  "+UpperBound(arr, 6));//3
    }
}
