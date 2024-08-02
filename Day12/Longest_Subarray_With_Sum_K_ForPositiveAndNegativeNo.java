// import  java.util.*;
import java.util.HashMap;
import java.util.Map;java.util.*;

public class Longest_Subarray_With_Sum_K_ForPositiveAndNegativeNo {
    public static int getLongestSubarray(int []nums, int k) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum==k){
            max=Math.max(max,i+1);
            }
            int rem=sum-k;

            if(map.containsKey(rem)){
                max=Math.max(max,i-map.get(rem));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
    }

}
public static void main(String[] args) {
    int arr[]={-1,1,1};   
    System.out.println(getLongestSubarray(arr,1));
}
}
