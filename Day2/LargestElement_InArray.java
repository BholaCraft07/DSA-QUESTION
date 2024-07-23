public class LargestElement_InArray {
    public static void main(String[] args) {
        // first we assume array first value is largest element
        // int arr[]={1, 8, 7, 56, 90};
        int arr[]={10,0};
        // int arr[]={5, 5, 5, 5};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest Element in Array :"+max);
    }
}
