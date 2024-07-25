import java.util.ArrayList;

public class Union_of_Two_Sorted_Arrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here

        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {
                if (arr.size() == 0 || arr.get(arr.size() - 1) != arr1[i]) {
                    arr.add(arr1[i]);
                }
                i++;
            } else {
                if (arr.size() == 0 || arr.get(arr.size() - 1) != arr2[j]) {
                    arr.add(arr2[j]);
                }
                j++;
            }
        }
        // skip duplicate
        // if any element in left array
        while (i < n) {
            if (arr.get(arr.size() - 1) != arr1[i])
                arr.add(arr1[i]);
            i++;
        }
        while (j < m) {
            if (arr.get(arr.size() - 1) != arr2[j])
                arr.add(arr2[j]);
            j++;
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5}  ;
        int arr2 [] = {1, 2, 3, 6, 7};
        ArrayList<Integer> ans=findUnion(arr1, arr2,arr1.length,arr2.length);
        for(int i:ans){
            System.out.print(i+"  ");
        }
        
    }
}
