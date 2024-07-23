public class FindSecondLargest_WithoutSorting {
    public static void main(String[] args) {
        // int arr[]={1, 8, 7, 56, 90};
        // int arr[]={5, 5, 5, 5};
        int arr[]={10,0};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int second;
        if(arr[0]==max) second=arr[1];
        else second=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>second && arr[i]!=max){
                second=arr[i];
            }
        }
        System.out.println("Second largest element is "+second);
    }
}
