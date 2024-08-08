/**
 * Find_First _and_Last_Position_of_Element_in_SortedArray
 */
public class Find_First_and_Last_Position_of_Element_in_SortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int first=FirstPosition(nums,target);
        if(first==nums.length || nums[first] !=target) return new int[]{-1,-1};
        else return new int[]{first,LastPosition(nums,target)-1};
        
    }
    public static int FirstPosition(int nums[],int x){
        int start=0,end=nums.length-1, ans=nums.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>=x){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
    public static int LastPosition(int nums[],int x){
        int start=0,end=nums.length-1,ans=nums.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>x){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
                
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int target=8;
        int[] result=searchRange(arr,target);
        System.out.println("First Occurence is "+result[0] +" and last occurence is "+result[1]);
    }
    
}