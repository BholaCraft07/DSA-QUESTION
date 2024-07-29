/**
 * Next_Permutation
 */
public class Next_Permutation {
    public static void nextPermutation(int arr[]){
        int len=arr.length;
        int idx=-1;
        for(int i=len-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            Reverse(arr,0,len-1);
            return;
        }
        for(int i=len-1;i>idx;i--){
            if(arr[i]>arr[idx]){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
        Reverse(arr,idx+1,len-1);
        System.gc();
        return;
    }

    private static void Reverse(int[] arr, int i, int j) {
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return;
    }
    static void PrintArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        } System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println("Original Array :");
        PrintArray(arr);
        System.out.println("Next Permutation no :");
        nextPermutation(arr);
        PrintArray(arr);
    }
    
}

/**
 * Algorithm
 * 1. first we initialize a index wich can indicate the next value from start is minimum
 * 2. if it is in descrizing order then reverse all array
 * 3. other wise find second minimum array which greater than the arr[index] value 
 * 4. then swap it from arr[idx ] and it own positon where it is present in array
 * 5. then reverse all array after the idex+1 value to end of array
 */