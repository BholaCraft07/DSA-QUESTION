public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
       int m = matrix[0].length;
       
       int[] row = new int[n];
       int[] col = new int[m];
       
       for(int i= 0 ; i < n ; i++){
           for(int j = 0 ; j < m ; j++){
               if(matrix[i][j] == 0){
                   row[i] = 1;
                   
                   col[j] = 1;
               }
           }
       }
       
       for(int i = 0 ; i < n ; i++){
           for(int j = 0 ; j< m ; j++){
               if(row[i] == 1 || col[j] == 1){
                   matrix[i][j] = 0;
               }
           }
       }
   }
   public static void main(String[] args) {
    int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
    setZeroes(arr);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
   }
}
