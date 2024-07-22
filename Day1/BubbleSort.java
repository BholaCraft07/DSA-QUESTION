package Day1;
public class BubbleSort {
    public static void bubbleSort(int arr[], int n)
    {
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+"  ");
        }
    }
    static void SecondMethod(int arr[],int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble sort second method \n");
        for(int i:arr){
            System.out.print(i+"  ");
        }

    }
    public static void main(String[] args) {
        int arr[]={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Bubble sort \n");
        bubbleSort(arr, arr.length);
        System.out.println("\n");
        SecondMethod(arr, arr.length);
    }
}
