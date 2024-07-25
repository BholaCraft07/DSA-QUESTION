public class MoveZeroes {
    public static void main(String[] args) {
        int arr[]={0,0,1};
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]!=0){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
            }
        }
        //after move zero from end
        for(int i:arr){
            System.out.print(i+"  ");
        }
    }
}
/*
 * Approach
 * 1. first we take two pointer first is left and second ins right
 * 2. both are same position in starting
 * 3. check right pointer allocate zero value if allocate zero value then we right by ine
 * 4. nhi to swap kar denge right aur left value of array
 * 5. then increase the value of left pointer
 */