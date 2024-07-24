public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println("Array is :");
        for(int i:arr){
            System.err.print(i+"  ");
        }
        System.out.println();
        int k=rempveDuplicate(arr);
        int removedupicate[]=new int[k];
        for(int i=0;i<k;i++){
            // System.out.print(arr[i]+"  ");
            removedupicate[i]=arr[i];
        }
        for(int i:removedupicate){
            System.err.print(i+"  ");
        }
        
    }
    static int rempveDuplicate(int arr[]){
        int i=1;
        int c=1;
        while(i<arr.length){
            if(arr[i]!=arr[i-1]){
                arr[c++]=arr[i];
            }
            i++;
        }
        return c;
    }
}
