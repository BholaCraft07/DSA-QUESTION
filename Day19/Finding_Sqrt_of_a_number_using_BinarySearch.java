public class Finding_Sqrt_of_a_number_using_BinarySearch {
    public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		//  int ans=1;
		 long start=1,end=N;
		 while(start<=end){
			 long mid=start+(end-start)/2;
			 if(mid*mid <=N) {
				//  ans=(int)mid;
				 start=mid+1;
				 }
			 else end=mid-1;
		 }
		 return (int)end;
	}
    public static void main(String[] args) {
        long n=7;
        System.out.println(sqrtN(n));
    }
}
