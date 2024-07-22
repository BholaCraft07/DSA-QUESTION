package Day1;
import java.util.*;
class selectionSort {

    static int select(int arr[], int i) {
        // code here such that selectionSort() sorts arr[]
        //here we initialize a min varialble which store the index of minimum value
        int min = i;
        //this method in only to find minimum element
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[min] > arr[j]) {
                min = j;
            }
        }
        return min;
    }

    static int[] selectionsort(int arr[], int n) {
        // this loop iterate all the array element it is work as a outer loop
        for (int i = 0; i < arr.length; i++) {
            //select method gives the index of small value which reason we can easily swap .
            int min = select(arr, i);
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;

    }

    //this is simplw optimal methodd in this code we use only two loop one is outer loop and second is inner loop 
    static void method2(int arr[]) {
        
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        // printing sorted array
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

    //this is recursion method to print array 
    static void Recursion(int arr[], int i) {
        //this is base case
        if (i == arr.length) {
            for (int j : arr) {
                System.out.print(j + "  ");
            }
            return;
        }
        //here we are only find small element index and then swap it
        int small = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[small] > arr[j]) {
                small = j;
            }
        }
        if (small != i) {
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        //this is recursion call
        Recursion(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 30, 90, 47, 69, 52, 88, 71, 18, 20 };
        int[] ans = selectionsort(arr, 0);
        for (int i : ans) {
            System.out.print(i + "  ");
        }
        // second method
        System.out.println("\n second method");
        method2(arr);
        System.out.println("\n Using recursion ");
        Recursion(arr, 0);
    }
}