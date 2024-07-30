public class QuickSort {
    static void quicksort(int arr[],int start,int end){
        if(start>=end) return;
        int p=partition(arr,start,end);
        quicksort(arr,start,p-1);
        quicksort(arr, p+1, end);c    c   
    }

    static int partition(int[] arr, int start, int end) {
        //first we assign pivot value
        int pivot=arr[start];
        //then count how mant value less than pivot value
        int count=0;
        //here we count
        for(int i=start+1;i<=end;i++){
            if(arr[i]<pivot) count++;
        }
        //here we calcuate pivot index 
        int pivotIndex=start+count;
        //then swap the pivot value where it index value get i mean swap value which are less than pivot 
        int temp=arr[pivotIndex];
        arr[pivotIndex]=arr[start];
        arr[start]=temp;
        // now move to iterate all value which are greater than pivot and less than pivot
        int i=start;
        int j=end;
        //here we applying loop less than pivot index and greater than pivot index
        while(i<pivotIndex && j>pivotIndex){
            //apply while loop if value of less than of it's value is less than 
            while(arr[i]<pivot){
                i++;
            }
            //here we can check either any value is not less than in arrary
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                int s=arr[i];
                arr[i]=arr[j];
                arr[j]=s;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    public static void main(String[] args) {
        int arr[]={2, 1, 6, 10, 4, 1, 3, 9, 7};
        quicksort(arr,0,arr.length-1);
        System.out.println("quick sort :");
        for(int i:arr){
            System.out.print(i+"  ");
        }
    }
}
