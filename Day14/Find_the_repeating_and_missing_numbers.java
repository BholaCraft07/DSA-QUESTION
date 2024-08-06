public class Find_the_repeating_and_missing_numbers {
    public static int[] findMissingRepeatingNumbers(int []a){
        int n = a.length;
        int[] ans = new int[2];
        //find the sum of first n natural no and sum of n square no
        int sumofNno=(n*(n+1))/2;
        int sumofNSquareNo=(n*(n+1)*(2*n+1))/6;

        //find sum of element of array which is present in array and also it square sum
        int sumofElement=0,sumofSquareOFEle=0;
        for(int i=0;i<n;i++){
            sumofElement+=a[i];
            sumofSquareOFEle+=a[i]*a[i];
        }
        //find the difference of sumofN no and sumofelemet in array also square 
        int val1=sumofElement-sumofNno;//x-y
        int val2=sumofSquareOFEle-sumofNSquareNo;//x^2-y^2

        //for find x+y from both above two equation
        val2=val2/val1;
        //for finding the value of x in (x+y)+(x-y)
        int x=(val1+val2)/2;
        int y=x-val1;
        //return x and y in which y is missing no and x is repeating no
        ans[0]=x;
        ans[1]=y;
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 2};
        int ans[]=findMissingRepeatingNumbers(arr);
        System.out.println("missing no is "+ans[1] +" and repeating no is "+ans[0]);
    }
}
