package Day1;

public class InsertionSort {
    public static void main(String[] args) {
        //array declaration
        int arr[]={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Nornal method \n");
        insertion(arr);
        System.out.println("\n Using Recursion to solve this question :\n");
        usingRecursion(arr,1);
    }
    static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            //asign value j in i
            //apply while loop which can swap all array element from an sort element
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int i:arr){
            System.out.print(i+"  ");
        }
    }
    static void usingRecursion(int arr[],int i){
        if(i==arr.length){
            for(int j:arr){
                System.out.print(j+"  ");
            }
            return;
        }
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
        usingRecursion(arr,i+1);
    }
}
