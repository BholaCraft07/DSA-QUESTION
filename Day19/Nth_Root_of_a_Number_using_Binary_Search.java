public class Nth_Root_of_a_Number_using_Binary_Search {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int start=1,end=m/n;
        while(start<=end){
            int mid=start+(end-start)/2;
            double val=Math.pow(mid,n);
            
            if(val==m)return mid;
            if(val<m){
                start=mid+1;
            }
            else end=mid-1;

        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(NthRoot(3,27));
    }
}
