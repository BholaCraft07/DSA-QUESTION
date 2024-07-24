/**
 * Check_if_Array_Is_Sorted_and_Rotated
 */

public class Check_if_Array_Is_Sorted_and_Rotated {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println("Array is Sort Or Not: \n");
        if (CheckSortedArray(arr)) {
            System.out.println("Array is Sorted ");
        }
        else{
            System.out.println("Array is Not sorted ");
        }
        
    }
    static boolean CheckSortedArray(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>arr[(i+1)%arr.length]) {
                count++;
            }
            if (count>1) {
                return false;
            }
        }
        return true;
    }
}