public class Count_Occurrences_in_SortedArray {
    public static int count(int arr[], int n, int x) {
        int lowerbound=LowerBound(arr, n, x);
        if(lowerbound==n || arr[lowerbound]!=x) return 0;
        else return UpperBound(arr, n, x)-lowerbound;
 
     }
     public static int LowerBound(int arr[],int n,int x){
         int start=0,end=n-1,ans=n;
         while(start<=end){
             int mid=(start+end)/2;
             if(arr[mid]>=x){
                 ans=mid;
                 end=mid-1;
             }
             else start=mid+1;
         }
         return ans;
     }
     public static int UpperBound(int arr[],int n,int x){
         int start=0,end=n-1,ans=n;
         while(start<=end){
             int mid=(start+end)/2;
             if(arr[mid]>x){
                 ans=mid;
                 end=mid-1;
             }
             else start=mid+1;
         }
         return ans;
     }
     public static void main(String[] args) {
        int arr[]={1, 1, 1, 2, 2, 3, 3};
        int n = arr.length;
        int x = 3;
        System.out.println(count(arr, n, x)); // Output:  2
     }
}
