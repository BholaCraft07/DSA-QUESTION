public class Sorted_Array_Search {
    static int searchInSorted(int arr[], int N, int K)
    {  // Your code here
        int find=-1;
        for(int i=0;i<N;i++){
            if(arr[i]==K)return 1;
        }
        return find;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        int ans=searchInSorted(arr, arr.length,6);
        System.out.println(ans);

    }
}

