import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Merge_Overlapping_SubIntervals
 */
public class Merge_Overlapping_SubIntervals {
    public static int[][] BruteeFroceApproach(int[][] arr){
        int n=arr.length;
         Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=arr[i][0];
            int end=arr[i][1];

            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
                continue;
            }
            for(int j=i+1;j<n;j++){
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(new int[]{start,end});
        
        }

        return ans.toArray(new int[ans.size()][]);
        
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 4}, {3, 5}, {6, 7}};
        int[][] result = BruteeFroceApproach(arr);
        System.out.println(Arrays.deepToString(result));

    }
}