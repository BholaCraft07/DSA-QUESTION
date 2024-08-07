public class Search_Insert_Position {
    public static int searchInsert(int [] arr, int m){
        // Write your code here.
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]>=m){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,7};
        System.out.println(searchInsert(arr, 9));
    }
}
