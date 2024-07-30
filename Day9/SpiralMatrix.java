import java.util.ArrayList;
import java.util.List;
/**
 * SpiralMatrix
 */
public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int top=0,right=col-1,left=0,bottom=row-1;
        List<Integer> st=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                st.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                st.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                st.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){

            for(int i=bottom;i>=top;i--){
                st.add(matrix[i][left]);
            }
            left++;
            }

        }
        return st;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans=spiralOrder(arr);
        System.out.println(ans);

    }
}