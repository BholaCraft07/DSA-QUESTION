import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> Threesum(int arr[]){
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i];
                sum+=arr[j];
                sum+=arr[k];
                if(sum>0)k--;
                else if(sum<0)j++;
                else{
                    List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    k--;
                    j++;
                    while(j<k && arr[j]==arr[j-1])j++;
                    while(j<k && arr[k]==arr[k+1])k--;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={-1,0,1,2,-1,-4};
        System.out.println(Threesum(arr));
    }
}
