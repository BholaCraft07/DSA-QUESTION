import java.util.ArrayList;

class Reverse_Pairs{
  public int reversePairs(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>2*nums[j]) count++;
        //     }
        // }
        // return count;

        return MergeSort(nums,0,nums.length-1);
    }
    public static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    
    public static int Count(int arr[],int low,int mid,int high){
        int right=mid+1,count=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]>2*(long)arr[right]) right++;
            count+=(right-(mid+1));
        }
        return count;
    }

    public static int MergeSort(int arr[],int low,int high){
        int count=0;
        if(low>=high) return count;
        int mid=(low+high)/2;
        count+=MergeSort(arr,low,mid);
        count+=MergeSort(arr,mid+1,high);
        count+=Count(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,3,1};
        int n=arr.length;
        System.out.println(MergeSort(arr,0,n-1));
    }
}
