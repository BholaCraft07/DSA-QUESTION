public class Rotate_Image {
    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        //finding transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        //reverse row element
        int st=0;int e=n-1;
        for(int i=0;i<n;i++){
           reverse(matrix,0,n-1,i);
        }
        return;
    }
    static void reverse(int arr[][],int s,int e,int i){
        while(s<=e){
            int t=arr[i][e];
            arr[i][e]=arr[i][s];
            arr[i][s]=t;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }

}

