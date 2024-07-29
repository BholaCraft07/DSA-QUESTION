import java.util.ArrayList;
public class  Array_Leaders {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        // ArrayList<Integer> st=new ArrayList<>();
        // if(n==0)return st;
        // int max=arr[n-1];
        // st.add(arr[n-1]);
        // for(int i=n-2;i>=0;i--){
        //     if(max<arr[i]){
        //         st.add(arr[i]);
        //         max=arr[i];
        //     }
        // }
        // Collections.reverse(st);
        // return st;


        ArrayList<Integer> res = new ArrayList<>();
        Integer currMax = Integer.MIN_VALUE;
        for(int x = arr.length - 1 ; x >= 0; x--){
            if(arr[x] >= currMax){
                res.add(0,arr[x]);
                currMax = arr[x];
            }
        }
        return res;
        
    }
    public static void main(String ar[]){
        int arr[]={16,17,4,3,5,2};
        ArrayList<Integer> ans=leaders(arr.length,arr);
        System.out.println(ans);

    }

}
