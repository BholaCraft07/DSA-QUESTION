/**
 * Find_out_how_many_dtimes_the_array_has_been_rotated
 */
public class Find_out_how_many_dtimes_the_array_has_been_rotated {
    public static int findKRotation(int []arr){
        int start=0,end=arr.length-1,ans=Integer.MAX_VALUE;
        while(start<=end){
             int mid=start+(end-start)/2;
 
             if(arr[mid]>=arr[start])
             {
                 ans=Math.min(ans,arr[start]);
                 start=mid+1;
             }
             else {
                 ans=Math.min(ans,arr[mid]);
                 end=mid-1;
             }
         }
 
         start=0;end=arr.length-1;
         while(start<=end){
             int mid=start+(end-start)/2;
 
             if(ans==arr[mid])return mid;
             if(arr[mid]>=arr[start])
             {
                 if(ans>=arr[start] && ans<=arr[mid]){
                     end=mid-1;
                 }
                 else start=mid+1;
             }
             else {
                 if(ans>=arr[mid] && ans<=arr[end]){
                     start=mid+1;
                 }
                 else end=mid-1;
             }
         }
         // System.out.println("index is "+ans);
         return -1;
     }
     public static void main(String[] args) {
        //  int[] arr = {4, 5, 6, 7, 8,9, 1, 2, 3};
         int[] arr = {3, 4, 5, 1, 2};
         System.out.println(findKRotation(arr));


     }
}