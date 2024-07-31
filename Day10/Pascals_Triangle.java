package Day10;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int arr[][] = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = 1;
            }
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                }
                if (i > 1 && j > 0 && j < i) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                temp.add(arr[i][j]);
            }
            list.add(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        for (List<Integer> temp : list) {
            for (Integer num : temp) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
