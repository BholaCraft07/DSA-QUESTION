import java.util.ArrayList;

public class Kth_Element_of_two_sorted_arrays {
     public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        // Write your coder here
        int left=0,right=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(left < arr1.size() && right < arr2.size()){
            if(arr1.get(left) <= arr2.get(right)){
                ans.add(arr1.get(left));
                left++;
            }
            else{
                ans.add(arr2.get(right));
                right++;
            }
        }
        while(left<arr1.size()){
            ans.add(arr1.get(left));
            left++;
        }
        while(right<arr2.size()){
            ans.add(arr2.get(right));
            right++;
        }
        return ans.get(k-1);
    }
    public static void main(String[] args) {
        int a[]={2, 3, 45};
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        int b[]={4, 6, 7, 8};
        for(int i:a){
            arr1.add(i);
        }
        for(int i:b){
            arr2.add(i);
        }

        int k=4;
        System.out.println(kthElement(arr1,arr2,a.length,b.length,k));
    }
}
