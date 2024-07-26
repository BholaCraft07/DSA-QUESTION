package Day5;

public class MissingNumber {
    public static int missing(int arr[]){
        int len=arr.length;
        int sum=0;
        int totalsum=(len*(len+1))/2;
        for(int i:arr){
            sum+=i;
        }
        return totalsum-sum;
    }
    public static void main(String[] args) {
        int arr[]={0,1};
        System.out.println("Missing number is :"+missing(arr));
    }
}
